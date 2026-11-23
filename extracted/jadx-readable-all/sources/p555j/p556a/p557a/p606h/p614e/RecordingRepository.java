package p555j.p556a.p557a.p606h.p614e;

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
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.d, reason: use source file name */
/* JADX INFO: compiled from: RecordingRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface RecordingRepository {
    /* JADX INFO: renamed from: A */
    Object mo14186A(HashMap<String, Object> map, Continuation<? super GetAnyResponse> continuation);

    /* JADX INFO: renamed from: C */
    Object mo14187C(int i, String str, int i2, String str2, Continuation<? super GetAnyResponse> continuation);

    /* JADX INFO: renamed from: E */
    Object mo14188E(int i, int i2, Continuation<? super GetAnyResponse2> continuation);

    /* JADX INFO: renamed from: a */
    Object mo14189a(long j2, Continuation<? super RecordingEntity> continuation);

    /* JADX INFO: renamed from: b */
    Object mo14190b(MultipartBody.c cVar, HashMap<String, RequestBody> map, Continuation<? super GetAnyResponse> continuation);

    /* JADX INFO: renamed from: c */
    Object mo14191c(int i, Continuation<? super GetListResponse<Present>> continuation);

    /* JADX INFO: renamed from: d */
    Object mo14192d(int i, HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    /* JADX INFO: renamed from: e */
    Object mo14193e(HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    /* JADX INFO: renamed from: f */
    Object mo14194f(int i, Continuation<? super GetItemResponse<Recording>> continuation);

    /* JADX INFO: renamed from: g */
    Object mo14195g(Continuation<? super GetListResponse<Simple2>> continuation);

    /* JADX INFO: renamed from: h */
    Object mo14196h(RecordingEntity recordingEntity, Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: i */
    Object mo14197i(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<Duet>> continuation);

    /* JADX INFO: renamed from: j */
    Object mo14198j(RecordingEntity recordingEntity, Continuation<? super Long> continuation);

    /* JADX INFO: renamed from: k */
    Object mo14199k(MultipartBody.c cVar, HashMap<String, RequestBody> map, MultipartBody.c cVar2, MultipartBody.c cVar3, Continuation<? super GetItemResponse<Recording>> continuation);

    /* JADX INFO: renamed from: l */
    Object mo14200l(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<Recording>> continuation);

    /* JADX INFO: renamed from: m */
    Object mo14201m(Continuation<? super List<RecordingEntity>> continuation);

    /* JADX INFO: renamed from: n */
    Object mo14202n(HashMap<String, Object> map, Continuation<? super GetListResponse<Simple3>> continuation);

    /* JADX INFO: renamed from: o */
    Object mo14203o(long j2, Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: p */
    Object mo14204p(int i, HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    /* JADX INFO: renamed from: q */
    Object mo14205q(HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    /* JADX INFO: renamed from: r */
    Object mo14206r(int i, Continuation<? super Response4<Unit>> continuation);

    /* JADX INFO: renamed from: s */
    Object mo14207s(int i, Continuation<? super GetItemResponse<Recording>> continuation);

    /* JADX INFO: renamed from: t */
    Object mo14208t(int i, HashMap<String, Object> map, Continuation<? super GetRecordingListResponse> continuation);

    /* JADX INFO: renamed from: z */
    Object mo14209z(int i, String str, int i2, Continuation<? super GetAnyResponse> continuation);
}
