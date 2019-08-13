package com.xiaojinzi.rxjava.datatype.list.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xiaojinzi.component.anno.RouterAnno
import com.xiaojinzi.rxjava.datatype.R

/**
 * 数据类型的列表界面
 */
@RouterAnno(
    path = "list"
)
class DataTypeListAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_type_list_act)
    }

}
