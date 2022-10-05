package com.unibague.bienestaruniversitario;



import com.unibague.bienestaruniversitario.Person;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST()
    Call<Person> addPerson(@Field("id") Long id, @Field("name") String name, @Field("lastName") String lastName,
                           @Field("email") String email, @Field("userType") String userType,
                           @Field("password") String password);

}
