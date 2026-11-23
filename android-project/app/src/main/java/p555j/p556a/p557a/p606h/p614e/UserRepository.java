package p555j.p556a.p557a.p606h.p614e;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Image;
import mtp.media.karaoke.data.model.Task;
import mtp.media.karaoke.data.model.Task4;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetAnyResponse3;
import mtp.media.karaoke.data.remote.response.GetCollectedRewardResponse;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p509g1.MultipartBody;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.g, reason: use source file name */
/* JADX INFO: compiled from: UserRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface UserRepository {
    /* JADX INFO: renamed from: F */
    Object mo14222F(HashMap<String, String> map, Continuation<? super GetListResponse<Image>> continuation);

    /* JADX INFO: renamed from: a */
    Object mo14223a(HashMap<String, Object> map, Continuation<? super GetItemResponse<Task4>> continuation);

    /* JADX INFO: renamed from: b */
    Object mo14224b(HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation);

    /* JADX INFO: renamed from: c */
    Object mo14225c(Continuation<? super GetListResponse<Task>> continuation);

    /* JADX INFO: renamed from: d */
    Object mo14226d(HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation);

    /* JADX INFO: renamed from: e */
    Object mo14227e(HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation);

    /* JADX INFO: renamed from: f */
    Object mo14228f(int i, Continuation<? super GetItemResponse<User>> continuation);

    /* JADX INFO: renamed from: g */
    Object mo14229g(HashMap<String, String> map, Continuation<? super GetAnyResponse> continuation);

    /* JADX INFO: renamed from: j */
    Object mo14230j(HashMap<String, Object> map, Continuation<? super GetListResponse<User>> continuation);

    /* JADX INFO: renamed from: l */
    Object mo14231l(HashMap<String, Object> map, Continuation<? super GetCollectedRewardResponse> continuation);

    /* JADX INFO: renamed from: m */
    Object mo14232m(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation);

    /* JADX INFO: renamed from: o */
    Object mo14233o(int i, int i2, Continuation<? super GetAnyResponse> continuation);

    /* JADX INFO: renamed from: q */
    Object mo14234q(MultipartBody.c cVar, Continuation<? super GetItemResponse<Image>> continuation);

    /* JADX INFO: renamed from: s */
    Object mo14235s(HashMap<String, String> map, Continuation<? super GetAnyResponse> continuation);

    /* JADX INFO: renamed from: t */
    Object mo14236t(HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation);

    /* JADX INFO: renamed from: u */
    Object mo14237u(HashMap<String, Object> map, Continuation<? super GetAnyResponse3> continuation);

    /* JADX INFO: renamed from: x */
    Object mo14238x(HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation);

    /* JADX INFO: renamed from: y */
    Object mo14239y(HashMap<String, Object> map, Continuation<? super Response4<Unit>> continuation);
}
