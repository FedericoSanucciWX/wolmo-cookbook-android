package ar.com.wolox.android.cookbook.twitterlogin.adapter

import com.twitter.sdk.android.core.TwitterSession

interface TwitterLoginListener {

    fun onAuthSuccess(result: TwitterSession)
    fun onAuthError(message: String?)
    fun onAuthFail()
}