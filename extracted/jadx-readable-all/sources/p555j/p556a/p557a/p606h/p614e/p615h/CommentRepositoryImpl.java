package p555j.p556a.p557a.p606h.p614e.p615h;

import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.CommentRepository;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.e.h.a, reason: use source file name */
/* JADX INFO: compiled from: CommentRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommentRepositoryImpl implements CommentRepository {

    /* JADX INFO: renamed from: a */
    public final ApiService f32369a;

    public CommentRepositoryImpl(ApiService apiService) {
        Intrinsics2.m13089e(apiService, "api");
        this.f32369a = apiService;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.CommentRepository
    /* JADX INFO: renamed from: b */
    public Object mo14175b(int i, String str, int i2, Continuation<? super GetListResponse<Comment>> continuation) {
        return this.f32369a.m14145b(i, str, i2, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.CommentRepository
    /* JADX INFO: renamed from: k */
    public Object mo14176k(int i, String str, String str2, Integer num, Integer num2, Continuation<? super GetItemResponse<Comment>> continuation) {
        return this.f32369a.m14158k(i, str, str2, num, num2, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.CommentRepository
    /* JADX INFO: renamed from: v */
    public Object mo14177v(int i, Continuation<? super Response4<Unit>> continuation) {
        return this.f32369a.m14169v(i, continuation);
    }
}
