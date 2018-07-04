package {{ cookiecutter.core_package_dir }}.utils.injection

import android.content.Context
{{ cookiecutter.core_package_dir }}.utils.resources.ResourceProvider
{{ cookiecutter.core_package_dir }}.utils.resources.ResourceProviderImpl
import dagger.Module
import dagger.Provides

@Module
class ResourcesModule {

    @Provides
    fun resourceProvider(context: Context): ResourceProvider =
            ResourceProviderImpl(context)
}