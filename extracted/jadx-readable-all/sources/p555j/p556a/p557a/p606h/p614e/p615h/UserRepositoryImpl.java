package p555j.p556a.p557a.p606h.p614e.p615h;

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
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.MultipartBody;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.h.g, reason: use source file name */
/* JADX INFO: compiled from: UserRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserRepositoryImpl implements UserRepository {

    /* JADX INFO: renamed from: a */
    public final ApiService f32377a;

    public UserRepositoryImpl(ApiService apiService) {
        Intrinsics2.m13089e(apiService, "api");
        this.f32377a = apiService;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: F */
    public Object mo14222F(HashMap<String, String> map, Continuation<? super GetListResponse<Image>> continuation) {
        return this.f32377a.m14122F(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: a */
    public Object mo14223a(HashMap<String, Object> map, Continuation<? super GetItemResponse<Task4>> continuation) {
        return this.f32377a.m14143a(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: b */
    public Object mo14224b(HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation) {
        return this.f32377a.m14132P(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: c */
    public Object mo14225c(Continuation<? super GetListResponse<Task>> continuation) {
        return this.f32377a.m14147c(continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: d */
    public Object mo14226d(HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation) {
        return this.f32377a.m14149d(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: e */
    public Object mo14227e(HashMap<String, String> map, Continuation<? super GetListResponse<User>> continuation) {
        return this.f32377a.m14133Q(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: f */
    public Object mo14228f(int i, Continuation<? super GetItemResponse<User>> continuation) {
        return this.f32377a.m14129M(i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: g */
    public Object mo14229g(HashMap<String, String> map, Continuation<? super GetAnyResponse> continuation) {
        return this.f32377a.m14127K(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: j */
    public Object mo14230j(HashMap<String, Object> map, Continuation<? super GetListResponse<User>> continuation) {
        return this.f32377a.m14157j(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: l */
    public Object mo14231l(HashMap<String, Object> map, Continuation<? super GetCollectedRewardResponse> continuation) {
        return this.f32377a.m14159l(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: m */
    public Object mo14232m(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation) {
        return this.f32377a.m14160m(i, map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: o */
    public Object mo14233o(int i, int i2, Continuation<? super GetAnyResponse> continuation) {
        return this.f32377a.m14162o(i, i2, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: q */
    public Object mo14234q(MultipartBody.c cVar, Continuation<? super GetItemResponse<Image>> continuation) {
        return this.f32377a.m14164q(cVar, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: s */
    public Object mo14235s(HashMap<String, String> map, Continuation<? super GetAnyResponse> continuation) {
        return this.f32377a.m14166s(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: t */
    public Object mo14236t(HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation) {
        return this.f32377a.m14167t(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: u */
    public Object mo14237u(HashMap<String, Object> map, Continuation<? super GetAnyResponse3> continuation) {
        return this.f32377a.m14168u(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: x */
    public Object mo14238x(HashMap<String, String> map, Continuation<? super GetItemResponse<User>> continuation) {
        return this.f32377a.m14171x(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.UserRepository
    /* JADX INFO: renamed from: y */
    public Object mo14239y(HashMap<String, Object> map, Continuation<? super Response4<Unit>> continuation) {
        return this.f32377a.m14172y(map, continuation);
    }
}
