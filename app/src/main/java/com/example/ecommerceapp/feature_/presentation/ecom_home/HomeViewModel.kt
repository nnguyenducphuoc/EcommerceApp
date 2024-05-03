package com.example.ecommerceapp.feature_.presentation.ecom_home

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerceapp.feature_.domain.use_case.PostUseCaseResult
import com.example.ecommerceapp.feature_.domain.use_case.PostUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val postUseCases: PostUseCases
): ViewModel() {

    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state

    fun getPostsByCategory() {
        viewModelScope.launch {
            val result = postUseCases.getPostItemsByCategory()

            when(result) {
                is PostUseCaseResult.Error -> {
                    Log.d("HomeViewModel", result.message)
                }
                is PostUseCaseResult.Success -> {
                    _state.value = _state.value.copy(
                        webItems = result.webItems,
                        mobileItems = result.mobileItems,
                        gameItems = result.gameItems,
                        isLoading = false
                    )
                }
            }
        }


    }
}