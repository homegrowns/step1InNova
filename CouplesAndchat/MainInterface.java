package CouplesAndchat;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainInterface
{
    @GET("v2/list")
    Call<String> string_call(
            @Query("page") int page,
            @Query("limit") int limit
    );
}
