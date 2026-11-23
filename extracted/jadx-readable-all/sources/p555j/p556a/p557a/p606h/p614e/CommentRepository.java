package p555j.p556a.p557a.p606h.p614e;

import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.a, reason: use source file name */
/* JADX INFO: compiled from: CommentRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface CommentRepository {
    /* JADX INFO: renamed from: b */
    Object mo14175b(int i, String str, int i2, Continuation<? super GetListResponse<Comment>> continuation);

    /* JADX INFO: renamed from: k */
    Object mo14176k(int i, String str, String str2, Integer num, Integer num2, Continuation<? super GetItemResponse<Comment>> continuation);

    /* JADX INFO: renamed from: v */
    Object mo14177v(int i, Continuation<? super Response4<Unit>> continuation);
}
