package p555j.p556a.p557a.p606h.p614e;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.c, reason: use source file name */
/* JADX INFO: compiled from: NotificationRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface NotificationRepository {
    /* JADX INFO: renamed from: D */
    Object mo14183D(int i, Continuation<? super Response4<Unit>> continuation);

    /* JADX INFO: renamed from: a */
    Object mo14184a(int i, HashMap<String, String> map, Continuation<? super GetItemResponse<Notification>> continuation);

    /* JADX INFO: renamed from: e */
    Object mo14185e(HashMap<String, String> map, Continuation<? super GetListResponse<Notification>> continuation);
}
