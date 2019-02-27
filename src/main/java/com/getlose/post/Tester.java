package com.getlose.post;

import com.google.gson.annotations.SerializedName;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tester {
    private static JsonPlaceHolderApi jsonPlaceHolderApi;
    public static void main(String[] args) {
        // 這句程式碼是為了用Gson把服務端返回的json資料解析成實體的,
        // 那就從這裡入手,可以自己定義一個GsonConverter,擴充套件一下原來的功能
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        System.out.println("----------------------------------------------------------------");

        //getPost();
        //getComment();
        createPost();
    }

    private static void createPost() {
       //1.
        //Post post = new Post(3,"title1","textttt..");
       //Call<Post> call = jsonPlaceHolderApi.createPost(post);

        //2.
        //Call<Post> call = jsonPlaceHolderApi.createPost(2,"titlteeee","textttt");

        //3.
        Map<String,String> fields = new HashMap();
        fields.put("userId","6");
        fields.put("title","ttttttt");
        fields.put("text","teeeeeeeeeee");

        Call<Post> call = jsonPlaceHolderApi.createPost(fields);

        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if(response.isSuccessful()){
                    Post postResponse = response.body();
                    String content = "";
                    content += "Code: " + response.code() + "\n";
                    content += "ID: " + postResponse.getId() + "\n";
                    content += "User ID: " + postResponse.getUserId() + "\n";
                    content += "Title: " + postResponse.getTitle() + "\n";
                    content += "Text: " + postResponse.getText() + "\n\n";
                    System.out.println(content);
                }else{
                    System.out.println(response.code());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }


    private static void getPost() {

        Map<String,String> parameters = new HashMap<>();
        parameters.put("userId","7");
        parameters.put("_sort","id");
        parameters.put("_order","desc");

        //Call<List<Post>> call = jsonPlaceHolderApi.getPosts(1,"id","desc");

        Call<List<Post>> call = jsonPlaceHolderApi.getPosts(parameters);

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(response.isSuccessful()){
                    List<Post> posts = response.body();
                    for(Post post:posts){
                        System.out.print("id:=>"+post.getId());
                        System.out.print(",user ID=>"+post.getUserId());
                        System.out.print(",title=>"+post.getTitle());
                        System.out.print(",text=>"+post.getText()+"\n");
                    }

                }else{
                    System.out.println("code: "+ response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                System.out.println("failure=>"+t.getMessage());
            }
        });
    }

    private static void getComment() {
        //Call<List<Comment>> call1 = jsonPlaceHolderApi.getComments(3);
        //Call<List<Comment>> call1 = jsonPlaceHolderApi.getComments("https://jsonplaceholder.typicode.com/comments?postId=1");
        Call<List<Comment>> call1 = jsonPlaceHolderApi.getComments();
        call1.enqueue(new Callback<List<Comment>>() {
            @Override
            public void onResponse(Call<List<Comment>> call, Response<List<Comment>> response) {
                if(response.isSuccessful()){
                    List<Comment> comments = response.body();
                    for(Comment comment:comments){
                        System.out.print("post id:=>"+comment.getPostId());
                        System.out.print(",id=>"+comment.getId());
                        System.out.print(",name=>"+comment.getName());
                        System.out.print(",email=>"+comment.getEmail());
                        System.out.println(",comment=>"+comment.getComment()+"\n");
                    }
                }else{
                    System.out.println("code: "+ response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Comment>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }

}


class Post{

    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    private int userId;

    private int id;

    private String title;

    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}

class Comment{
    private int postId;

    private int id;

    private String name;

    private String email;

    @SerializedName("body")
    private String comment;

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }
}