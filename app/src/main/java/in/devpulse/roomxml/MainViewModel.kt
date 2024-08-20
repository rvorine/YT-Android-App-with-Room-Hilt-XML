package `in`.devpulse.roomxml

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.devpulse.roomxml.repository.TodoRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: TodoRepository
) :ViewModel() {

}