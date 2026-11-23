package p555j.p556a.p557a.p606h.p614e.p615h;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.NotificationRepository;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.h.c, reason: use source file name */
/* JADX INFO: compiled from: NotificationRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationRepositoryImpl implements NotificationRepository {

    /* JADX INFO: renamed from: a */
    public final ApiService f32371a;

    public NotificationRepositoryImpl(ApiService apiService) {
        Intrinsics2.m13089e(apiService, "api");
        this.f32371a = apiService;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.NotificationRepository
    /* JADX INFO: renamed from: D */
    public Object mo14183D(int i, Continuation<? super Response4<Unit>> continuation) {
        return this.f32371a.m14120D(i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.NotificationRepository
    /* JADX INFO: renamed from: a */
    public Object mo14184a(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<Notification>> continuation) {
        return this.f32371a.m14130N(i, map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.NotificationRepository
    /* JADX INFO: renamed from: e */
    public Object mo14185e(HashMap<String, String> map, Continuation<? super GetListResponse<Notification>> continuation) {
        return this.f32371a.m14151e(map, continuation);
    }
}
