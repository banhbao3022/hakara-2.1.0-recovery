package p555j.p556a.p557a.p606h.p614e;

import java.util.List;
import mtp.media.karaoke.data.model.Keyword;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p555j.p556a.p557a.p606h.p609c.p611b.KeywordEntity;

/* JADX INFO: renamed from: j.a.a.h.e.e, reason: use source file name */
/* JADX INFO: compiled from: SearchRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface SearchRepository {
    /* JADX INFO: renamed from: a */
    Object mo14210a(String str, int i, Continuation<? super GetListResponse<User>> continuation);

    /* JADX INFO: renamed from: b */
    Object mo14211b(String str, Continuation<? super KeywordEntity> continuation);

    /* JADX INFO: renamed from: c */
    Object mo14212c(KeywordEntity keywordEntity, Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: d */
    Object mo14213d(int i, String str, Continuation<? super GetListResponse<Keyword>> continuation);

    /* JADX INFO: renamed from: e */
    Object mo14214e(String str, Continuation<? super GetItemResponse<Keyword>> continuation);

    /* JADX INFO: renamed from: f */
    Object mo14215f(String str, String str2, String str3, String str4, Continuation<Object> continuation);

    /* JADX INFO: renamed from: g */
    Object mo14216g(Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: h */
    Object mo14217h(String str, int i, Continuation<? super GetListResponse<Song>> continuation);

    /* JADX INFO: renamed from: i */
    Object mo14218i(int i, Continuation<? super List<KeywordEntity>> continuation);
}
