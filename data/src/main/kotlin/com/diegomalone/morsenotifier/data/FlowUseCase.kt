package com.diegomalone.morsenotifier.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn

abstract class FlowUseCase<in Params, R>(private val coroutineDispatcher: CoroutineDispatcher) {
    operator fun invoke(params: Params): Flow<Result<R>> = execute(params)
        .catch { e -> emit(Result.Failure(Exception(e))) }
        .flowOn(coroutineDispatcher)

    protected abstract fun execute(params: Params): Flow<Result<R>>
}