package p555j.p556a.p557a.p606h.p613d;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.model.Image;
import mtp.media.karaoke.data.model.Keyword;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Simple2;
import mtp.media.karaoke.data.model.Simple3;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.Task;
import mtp.media.karaoke.data.model.Task4;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetAnyResponse2;
import mtp.media.karaoke.data.remote.response.GetAnyResponse3;
import mtp.media.karaoke.data.remote.response.GetAnyResponse4;
import mtp.media.karaoke.data.remote.response.GetCollectedRewardResponse;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import mtp.media.karaoke.data.remote.response.GetRecordingListResponse;
import mtp.media.karaoke.data.remote.response.GetSongListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p623k1.Response4;
import p623k1.p626g0.Body;
import p623k1.p626g0.DELETE;
import p623k1.p626g0.GET;
import p623k1.p626g0.Multipart;
import p623k1.p626g0.POST;
import p623k1.p626g0.PUT;
import p623k1.p626g0.Part;
import p623k1.p626g0.PartMap;
import p623k1.p626g0.Path;
import p623k1.p626g0.Query;
import p623k1.p626g0.QueryMap;

/* JADX INFO: renamed from: j.a.a.h.d.a, reason: use source file name */
/* JADX INFO: compiled from: ApiService.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ApiService {
    @POST("/v1/recordings/sendInviteDuet")
    /* JADX INFO: renamed from: A */
    Object m14117A(@QueryMap HashMap<String, Object> map, Continuation<? super GetAnyResponse> continuation);

    @GET("/v1/gifts/recording/top")
    /* JADX INFO: renamed from: B */
    Object m14118B(@Query("recording_id") int i, @Query("page") int i2, Continuation<? super GetListResponse<Present>> continuation);

    @POST("/v1/shares")
    /* JADX INFO: renamed from: C */
    Object m14119C(@Query("shareable_id") int i, @Query("shareable_type") String str, @Query("social") int i2, @Query("message") String str2, Continuation<? super GetAnyResponse> continuation);

    @DELETE("/v1/notifications/{id}")
    /* JADX INFO: renamed from: D */
    Object m14120D(@Path("id") int i, Continuation<? super Response4<Unit>> continuation);

    @POST("/v1/recordings/pin")
    /* JADX INFO: renamed from: E */
    Object m14121E(@Query("id") int i, @Query("status") int i2, Continuation<? super GetAnyResponse2> continuation);

    @GET("/v1/images/list")
    /* JADX INFO: renamed from: F */
    Object m14122F(@QueryMap HashMap<String, String> map, Continuation<? super GetListResponse<Image>> continuation);

    @GET("/v1/recordings/following")
    /* JADX INFO: renamed from: G */
    Object m14123G(@QueryMap HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    @GET("/v1/explores/recordings")
    /* JADX INFO: renamed from: H */
    Object m14124H(@QueryMap HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    @POST("/v1/duets/{id}")
    /* JADX INFO: renamed from: I */
    Object m14125I(@Path("id") int i, @Body HashMap<String, String> map, Continuation<? super GetItemResponse<Duet>> continuation);

    @GET("/v1/duets/recordings")
    /* JADX INFO: renamed from: J */
    Object m14126J(@QueryMap HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    @POST("/v1/auth/device")
    /* JADX INFO: renamed from: K */
    Object m14127K(@QueryMap HashMap<String, String> map, Continuation<? super GetAnyResponse> continuation);

    @GET("/v1/recordings")
    /* JADX INFO: renamed from: L */
    Object m14128L(@QueryMap HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    @GET("/v1/users/{id}")
    /* JADX INFO: renamed from: M */
    Object m14129M(@Path("id") int i, Continuation<? super GetItemResponse<User>> continuation);

    @POST("/v1/notifications/markAsRead/{id}")
    /* JADX INFO: renamed from: N */
    Object m14130N(@Path("id") int i, @QueryMap HashMap<String, String> map, Continuation<? super GetItemResponse<Notification>> continuation);

    @GET("/v1/songs/getLink")
    /* JADX INFO: renamed from: O */
    Object m14131O(@Query("youtube_id") String str, @Query("type") int i, Continuation<? super GetAnyResponse4> continuation);

    @GET("/v1/users/suggestion")
    /* JADX INFO: renamed from: P */
    Object m14132P(@QueryMap HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation);

    @GET("/v1/follows/followers")
    /* JADX INFO: renamed from: Q */
    Object m14133Q(@QueryMap HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation);

    @GET("/v1/songs")
    /* JADX INFO: renamed from: R */
    Object m14134R(@QueryMap HashMap<String, String> map, Continuation<? super GetSongListResponse> continuation);

    @GET("/v1/users/search")
    /* JADX INFO: renamed from: S */
    Object m14135S(@Query("q") String str, @Query("page") int i, Continuation<? super GetListResponse<User>> continuation);

    @GET("/v1/keywords")
    /* JADX INFO: renamed from: T */
    Object m14136T(@Query("page") int i, @Query("orderBy") String str, Continuation<? super GetListResponse<Keyword>> continuation);

    @GET("/v1/recordings/detail/{id}")
    /* JADX INFO: renamed from: U */
    Object m14137U(@Path("id") int i, Continuation<? super GetItemResponse<Recording>> continuation);

    @GET("/v1/gifts")
    /* JADX INFO: renamed from: V */
    Object m14138V(Continuation<? super GetListResponse<Gift>> continuation);

    @GET("/v1/recordings/nearby")
    /* JADX INFO: renamed from: W */
    Object m14139W(@QueryMap HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    @GET("/v1/songs/{id}")
    /* JADX INFO: renamed from: X */
    Object m14140X(@Path("id") int i, Continuation<? super GetItemResponse<Song>> continuation);

    @GET("/v1/recordings/ranking/{id}")
    /* JADX INFO: renamed from: Y */
    Object m14141Y(@Path("id") int i, @QueryMap HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    @POST("/v1/songs/downloadFromYoutube")
    @Multipart
    /* JADX INFO: renamed from: Z */
    Object m14142Z(@Part MultipartBody.c cVar, @PartMap HashMap<String, RequestBody> map, Continuation<? super GetAnyResponse> continuation);

    @POST("/v1/daily-task/addLog")
    /* JADX INFO: renamed from: a */
    Object m14143a(@QueryMap HashMap<String, Object> map, Continuation<? super GetItemResponse<Task4>> continuation);

    @POST("/v1/keywords")
    /* JADX INFO: renamed from: a0 */
    Object m14144a0(@Query("name") String str, Continuation<? super GetItemResponse<Keyword>> continuation);

    @GET("/v1/comments")
    /* JADX INFO: renamed from: b */
    Object m14145b(@Query("commentable_id") int i, @Query("commentable_type") String str, @Query("page") int i2, Continuation<? super GetListResponse<Comment>> continuation);

    @GET("/v1/gifts/user")
    /* JADX INFO: renamed from: b0 */
    Object m14146b0(@QueryMap HashMap<String, Object> map, Continuation<? super GetListResponse<Present>> continuation);

    @GET("/v1/daily-task")
    /* JADX INFO: renamed from: c */
    Object m14147c(Continuation<? super GetListResponse<Task>> continuation);

    @PUT("/v1/recordings/{id}")
    /* JADX INFO: renamed from: c0 */
    Object m14148c0(@Path("id") int i, @QueryMap HashMap<String, String> map, Continuation<? super GetItemResponse<Recording>> continuation);

    @GET("/v1/follows/following")
    /* JADX INFO: renamed from: d */
    Object m14149d(@QueryMap HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation);

    @GET("http://suggestqueries.google.com/complete/search")
    /* JADX INFO: renamed from: d0 */
    Object m14150d0(@Query("q") String str, @Query("client") String str2, @Query("ds") String str3, @Query("hl") String str4, Continuation<Object> continuation);

    @GET("/v1/notifications")
    /* JADX INFO: renamed from: e */
    Object m14151e(@QueryMap HashMap<String, String> map, Continuation<? super GetListResponse<Notification>> continuation);

    @POST("/v1/recordings")
    @Multipart
    /* JADX INFO: renamed from: e0 */
    Object m14152e0(@Part MultipartBody.c cVar, @PartMap HashMap<String, RequestBody> map, @Part MultipartBody.c cVar2, @Part MultipartBody.c cVar3, Continuation<? super GetItemResponse<Recording>> continuation);

    @GET("/v1/recordings/singDuetJoin/{id}")
    /* JADX INFO: renamed from: f */
    Object m14153f(@Path("id") int i, Continuation<? super GetItemResponse<Recording>> continuation);

    @GET("/v1/recordings/background")
    /* JADX INFO: renamed from: g */
    Object m14154g(Continuation<? super GetListResponse<Simple2>> continuation);

    @GET("/v1/songs/search")
    /* JADX INFO: renamed from: h */
    Object m14155h(@Query("name") String str, @Query("page") int i, Continuation<? super GetListResponse<Song>> continuation);

    @POST("/v1/gifts/present")
    /* JADX INFO: renamed from: i */
    Object m14156i(@Query("recording_id") int i, @Query("gift_id") int i2, @Query("quantity") int i3, @Query("unique_id") String str, Continuation<? super GetAnyResponse> continuation);

    @GET("/v1/blocks")
    /* JADX INFO: renamed from: j */
    Object m14157j(@QueryMap HashMap<String, Object> map, Continuation<? super GetListResponse<User>> continuation);

    @POST("/v1/comments")
    /* JADX INFO: renamed from: k */
    Object m14158k(@Query("commentable_id") int i, @Query("commentable_type") String str, @Query("message") String str2, @Query("parent_id") Integer num, @Query("quote_id") Integer num2, Continuation<? super GetItemResponse<Comment>> continuation);

    @POST("/v1/daily-task/collect-reward")
    /* JADX INFO: renamed from: l */
    Object m14159l(@QueryMap HashMap<String, Object> map, Continuation<? super GetCollectedRewardResponse> continuation);

    @POST("/v1/users/{id}")
    /* JADX INFO: renamed from: m */
    Object m14160m(@Path("id") int i, @QueryMap HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation);

    @GET("/v1/explores")
    /* JADX INFO: renamed from: n */
    Object m14161n(@QueryMap HashMap<String, Object> map, Continuation<? super GetListResponse<Simple3>> continuation);

    @POST("/v1/blocks")
    /* JADX INFO: renamed from: o */
    Object m14162o(@Query("blocked_id") int i, @Query("status") int i2, Continuation<? super GetAnyResponse> continuation);

    @GET("/v1/recordings/duet/{id}")
    /* JADX INFO: renamed from: p */
    Object m14163p(@Path("id") int i, @QueryMap HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    @POST("/v1/images/add")
    @Multipart
    /* JADX INFO: renamed from: q */
    Object m14164q(@Part MultipartBody.c cVar, Continuation<? super GetItemResponse<Image>> continuation);

    @DELETE("/v1/recordings/{id}")
    /* JADX INFO: renamed from: r */
    Object m14165r(@Path("id") int i, Continuation<? super Response4<Unit>> continuation);

    @POST("/v1/follows")
    /* JADX INFO: renamed from: s */
    Object m14166s(@QueryMap HashMap<String, String> map, Continuation<? super GetAnyResponse> continuation);

    @POST("/v1/auth/google/login")
    /* JADX INFO: renamed from: t */
    Object m14167t(@QueryMap HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation);

    @POST("/v1/diamonds/apple/exchange")
    /* JADX INFO: renamed from: u */
    Object m14168u(@QueryMap HashMap<String, Object> map, Continuation<? super GetAnyResponse3> continuation);

    @DELETE("/v1/comments/{id}")
    /* JADX INFO: renamed from: v */
    Object m14169v(@Path("id") int i, Continuation<? super Response4<Unit>> continuation);

    @GET("/v1/gifts/receiver/top")
    /* JADX INFO: renamed from: w */
    Object m14170w(@Query("receiver_id") int i, @Query("page") int i2, Continuation<? super GetListResponse<Present>> continuation);

    @POST("/v1/auth/facebook/login")
    /* JADX INFO: renamed from: x */
    Object m14171x(@QueryMap HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation);

    @POST("/v1/images/deletes")
    /* JADX INFO: renamed from: y */
    Object m14172y(@Body HashMap<String, Object> map, Continuation<? super Response4<Unit>> continuation);

    @POST("/v1/likes")
    /* JADX INFO: renamed from: z */
    Object m14173z(@Query("likeable_id") int i, @Query("likeable_type") String str, @Query("status") int i2, Continuation<? super GetAnyResponse> continuation);
}
