package p555j.p556a.p557a.p606h.p614e.p615h;

import java.util.HashMap;
import java.util.List;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Simple2;
import mtp.media.karaoke.data.model.Simple3;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetAnyResponse2;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import mtp.media.karaoke.data.remote.response.GetRecordingListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.h.d, reason: use source file name */
/* JADX INFO: compiled from: RecordingRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingRepositoryImpl implements RecordingRepository {

    /* JADX INFO: renamed from: a */
    public final ApiService f32372a;

    /* JADX INFO: renamed from: b */
    public final RecordingDao f32373b;

    public RecordingRepositoryImpl(ApiService apiService, RecordingDao recordingDao) {
        Intrinsics2.m13089e(apiService, "api");
        Intrinsics2.m13089e(recordingDao, "recordingDao");
        this.f32372a = apiService;
        this.f32373b = recordingDao;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: A */
    public Object mo14186A(HashMap<String, Object> map, Continuation<? super GetAnyResponse> continuation) {
        return this.f32372a.m14117A(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: C */
    public Object mo14187C(int i, String str, int i2, String str2, Continuation<? super GetAnyResponse> continuation) {
        return this.f32372a.m14119C(i, str, i2, str2, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: E */
    public Object mo14188E(int i, int i2, Continuation<? super GetAnyResponse2> continuation) {
        return this.f32372a.m14121E(i, i2, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: a */
    public Object mo14189a(long j2, Continuation<? super RecordingEntity> continuation) {
        return this.f32373b.mo14041a(j2, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: b */
    public Object mo14190b(MultipartBody.c cVar, HashMap<String, RequestBody> map, Continuation<? super GetAnyResponse> continuation) {
        return this.f32372a.m14142Z(cVar, map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: c */
    public Object mo14191c(int i, Continuation<? super GetListResponse<Present>> continuation) {
        return this.f32372a.m14118B(i, 1, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: d */
    public Object mo14192d(int i, HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation) {
        if (i == 2) {
            return this.f32372a.m14139W(map, continuation);
        }
        if (i == 3) {
            return this.f32372a.m14128L(map, continuation);
        }
        return i == 1 ? this.f32372a.m14123G(map, continuation) : this.f32372a.m14128L(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: e */
    public Object mo14193e(HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation) {
        return this.f32372a.m14124H(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: f */
    public Object mo14194f(int i, Continuation<? super GetItemResponse<Recording>> continuation) {
        return this.f32372a.m14153f(i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: g */
    public Object mo14195g(Continuation<? super GetListResponse<Simple2>> continuation) {
        return this.f32372a.m14154g(continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: h */
    public Object mo14196h(RecordingEntity recordingEntity, Continuation<? super Unit> continuation) {
        Object objMo14043c = this.f32373b.mo14043c(recordingEntity, continuation);
        return objMo14043c == Intrinsics.COROUTINE_SUSPENDED ? objMo14043c : Unit.f29502a;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: i */
    public Object mo14197i(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<Duet>> continuation) {
        return this.f32372a.m14125I(i, map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: j */
    public Object mo14198j(RecordingEntity recordingEntity, Continuation<? super Long> continuation) {
        return this.f32373b.mo14042b(recordingEntity, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: k */
    public Object mo14199k(MultipartBody.c cVar, HashMap<String, RequestBody> map, MultipartBody.c cVar2, MultipartBody.c cVar3, Continuation<? super GetItemResponse<Recording>> continuation) {
        return this.f32372a.m14152e0(cVar, map, cVar2, cVar3, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: l */
    public Object mo14200l(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<Recording>> continuation) {
        return this.f32372a.m14148c0(i, map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: m */
    public Object mo14201m(Continuation<? super List<RecordingEntity>> continuation) {
        return this.f32373b.mo14044d(continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: n */
    public Object mo14202n(HashMap<String, Object> map, Continuation<? super GetListResponse<Simple3>> continuation) {
        return this.f32372a.m14161n(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: o */
    public Object mo14203o(long j2, Continuation<? super Unit> continuation) {
        Object objMo14045e = this.f32373b.mo14045e(j2, continuation);
        return objMo14045e == Intrinsics.COROUTINE_SUSPENDED ? objMo14045e : Unit.f29502a;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: p */
    public Object mo14204p(int i, HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation) {
        return this.f32372a.m14163p(i, map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: q */
    public Object mo14205q(HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation) {
        return this.f32372a.m14126J(map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: r */
    public Object mo14206r(int i, Continuation<? super Response4<Unit>> continuation) {
        return this.f32372a.m14165r(i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: s */
    public Object mo14207s(int i, Continuation<? super GetItemResponse<Recording>> continuation) {
        return this.f32372a.m14137U(i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: t */
    public Object mo14208t(int i, HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation) {
        return this.f32372a.m14141Y(i, map, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.RecordingRepository
    /* JADX INFO: renamed from: z */
    public Object mo14209z(int i, String str, int i2, Continuation<? super GetAnyResponse> continuation) {
        return this.f32372a.m14173z(i, str, i2, continuation);
    }
}
