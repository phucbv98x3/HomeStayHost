package open.hosthomestay.ui.login

import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import open.hosthomestay.R
import open.hosthomestay.data.api.ApiCoroutines
import open.hosthomestay.ui.base.BaseViewModel
import open.hosthomestay.utils.printLog
import kotlin.math.log

/**
 * Created by OpenYourEyes on 10/22/2020
 */
class LoginViewModel : BaseViewModel() {


    suspend fun saveUserName(name: String) {
        dataManager.saveUserName(name)
    }

    private suspend fun getUserName(): String {
        return dataManager.getUserName()
    }


    fun saveUser(view: View) {
        viewModelScope.launch {
            val name = getUserName()
            saveUserName("Hello")
            val bundle = bundleOf("DKS" to "OpenYourEyes")
            navigation.navigate(R.id.listFragment, bundle = bundle, addToBackStack = false)
        }
        login()
    }

    fun login() {
        apiService.createApiCoroutines("Hello")
    }
}