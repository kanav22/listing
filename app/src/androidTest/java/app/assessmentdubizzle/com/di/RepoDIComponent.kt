package app.assessmentdubizzle.com.di

import app.assessmentdubizzle.com.modules.repository.Repository
import kotlinx.coroutines.CoroutineScope
import org.koin.dsl.module


val RepoDependency = module {

    factory {
            (scope: CoroutineScope) ->
        Repository(scope)
    }

}