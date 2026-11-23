package p555j.p556a.p557a.p606h.p614e.p615h;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.p485u.Continuation;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.GiftRepository;

/* JADX INFO: renamed from: j.a.a.h.e.h.b, reason: use source file name */
/* JADX INFO: compiled from: GiftRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GiftRepositoryImpl implements GiftRepository {

    /* JADX INFO: renamed from: a */
    public final ApiService f32370a;

    public GiftRepositoryImpl(ApiService apiService) {
        Intrinsics2.m13089e(apiService, "api");
        this.f32370a = apiService;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.GiftRepository
    /* JADX INFO: renamed from: B */
    public Object mo14178B(int i, int i2, Continuation<? super GetListResponse<Present>> continuation) {
        return this.f32370a.m14118B(i, i2, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.GiftRepository
    /* JADX INFO: renamed from: a */
    public Object mo14179a(HashMap<String, Object> map, Continuation<? super GetListResponse<Present>> continuation) {
        return this.f32370a.m14146b0(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.GiftRepository
    /* JADX INFO: renamed from: b */
    public Object mo14180b(Continuation<? super GetListResponse<Gift>> continuation) {
        return this.f32370a.m14138V(continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.GiftRepository
    /* JADX INFO: renamed from: i */
    public Object mo14181i(int i, int i2, int i3, String str, Continuation<? super GetAnyResponse> continuation) {
        return this.f32370a.m14156i(i, i2, i3, str, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.GiftRepository
    /* JADX INFO: renamed from: w */
    public Object mo14182w(int i, int i2, Continuation<? super GetListResponse<Present>> continuation) {
        return this.f32370a.m14170w(i, i2, continuation);
    }
}
