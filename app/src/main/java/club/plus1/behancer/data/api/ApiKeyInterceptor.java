package club.plus1.behancer.data.api;

import android.support.annotation.NonNull;

import club.plus1.behancer.BuildConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Vladislav Falzan.
 */

public class ApiKeyInterceptor implements Interceptor {

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl httpUrl = request.url().newBuilder()
                .addQueryParameter("client_id", BuildConfig.API_KEY)
                .build();
        request = request.newBuilder().url(httpUrl).build();

        return chain.proceed(request);
    }
}