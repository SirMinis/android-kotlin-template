package {{ cookiecutter.core_package_name }}.utils.resources

import android.content.Context

class ResourceProviderImpl(
        private val context: Context
) : ResourceProvider {

    override fun getString(stringId: Int): String =
            context.getString(stringId)
}