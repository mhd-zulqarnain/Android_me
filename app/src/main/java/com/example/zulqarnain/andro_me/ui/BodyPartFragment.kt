package com.example.zulqarnain.andro_me.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.example.zulqarnain.andro_me.R
import com.example.zulqarnain.andro_me.data.Utils


class BodyPartFragment : Fragment() {
    private var imageId: Int? = null
    private var imageIndex: Int = 1


    val utils: Utils = Utils.createUtils();
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragement_body_part, container, false)
        var imageView: ImageView
        imageView = view.findViewById(R.id.body_image_view)
        imageView.setImageResource(utils.getBody().get(imageIndex))

        return view
    }

    public fun setImageId(id: Int) {
        imageId = id
    }

    public fun setImageIndex(index: Int) {
        imageIndex = index
    }


}
