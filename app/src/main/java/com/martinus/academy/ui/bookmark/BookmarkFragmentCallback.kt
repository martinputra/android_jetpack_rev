package com.martinus.academy.ui.bookmark

import com.martinus.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}