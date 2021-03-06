package {{ cookiecutter.core_package_name }}.domain

import io.reactivex.Observable

interface ObservableUseCase<in Params, Return> {

    fun build(params: Params? = null): Observable<Return>
}