package p555j.p556a.p557a.p606h.p614e;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.p485u.Continuation;

/* JADX INFO: renamed from: j.a.a.h.e.b, reason: use source file name */
/* JADX INFO: compiled from: GiftRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface GiftRepository {
    /* JADX INFO: renamed from: B */
    Object mo14178B(int i, int i2, Continuation<? super GetListResponse<Present>> continuation);

    /* JADX INFO: renamed from: a */
    Object mo14179a(HashMap<String, Object> map, Continuation<? super GetListResponse<Present>> continuation);

    /* JADX INFO: renamed from: b */
    Object mo14180b(Continuation<? super GetListResponse<Gift>> continuation);

    /* JADX INFO: renamed from: i */
    Object mo14181i(int i, int i2, int i3, String str, Continuation<? super GetAnyResponse> continuation);

    /* JADX INFO: renamed from: w */
    Object mo14182w(int i, int i2, Continuation<? super GetListResponse<Present>> continuation);
}
