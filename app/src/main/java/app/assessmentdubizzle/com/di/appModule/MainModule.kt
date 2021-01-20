package app.assessmentdubizzle.com.di.appModule


import app.assessmentdubizzle.com.modules.repository.Repository
import app.assessmentdubizzle.com.modules.view.viewModels.DynamoWriterVM
import kotlinx.coroutines.CoroutineScope
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val mainModule = module {

    factory {
            (scope: CoroutineScope) ->
        Repository(scope = scope)
    }

    viewModel {
        DynamoWriterVM()
    }
}
