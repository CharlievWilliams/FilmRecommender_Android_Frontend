package com.charlievwwilliams.filmrecommender

import com.charlievwwilliams.filmrecommender.viewmodels.RecommendationsViewModel
import com.charlievwwilliams.filmrecommender.viewmodels.SearchResultViewModel
import com.charlievwwilliams.filmrecommender.viewmodels.SearchViewModel
import com.charlievwwilliams.filmrecommender.viewmodels.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

}

val viewModelModule = module {
    viewModel { SplashViewModel() }
    viewModel { SearchViewModel() }
    viewModel { SearchResultViewModel() }
    viewModel { RecommendationsViewModel() }
}