package p555j.p556a.p557a.p606h.p614e.p615h;

import java.util.List;
import mtp.media.karaoke.data.model.Keyword;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao;
import p555j.p556a.p557a.p606h.p609c.p611b.KeywordEntity;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;

/* JADX INFO: renamed from: j.a.a.h.e.h.e, reason: use source file name */
/* JADX INFO: compiled from: SearchRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchRepositoryImpl implements SearchRepository {

    /* JADX INFO: renamed from: a */
    public final ApiService f32374a;

    /* JADX INFO: renamed from: b */
    public final KeywordDao f32375b;

    public SearchRepositoryImpl(ApiService apiService, KeywordDao keywordDao) {
        Intrinsics2.m13089e(apiService, "api");
        Intrinsics2.m13089e(keywordDao, "keywordDao");
        this.f32374a = apiService;
        this.f32375b = keywordDao;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: a */
    public Object mo14210a(String str, int i, Continuation<? super GetListResponse<User>> continuation) {
        return this.f32374a.m14135S(str, i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: b */
    public Object mo14211b(String str, Continuation<? super KeywordEntity> continuation) {
        return this.f32375b.mo14035a(str, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: c */
    public Object mo14212c(KeywordEntity keywordEntity, Continuation<? super Unit> continuation) {
        Object objMo14037c = this.f32375b.mo14037c(keywordEntity, continuation);
        return objMo14037c == Intrinsics.COROUTINE_SUSPENDED ? objMo14037c : Unit.f29502a;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: d */
    public Object mo14213d(int i, String str, Continuation<? super GetListResponse<Keyword>> continuation) {
        return this.f32374a.m14136T(i, str, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: e */
    public Object mo14214e(String str, Continuation<? super GetItemResponse<Keyword>> continuation) {
        return this.f32374a.m14144a0(str, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: f */
    public Object mo14215f(String str, String str2, String str3, String str4, Continuation<Object> continuation) {
        return this.f32374a.m14150d0(str, str2, str3, str4, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: g */
    public Object mo14216g(Continuation<? super Unit> continuation) {
        Object objMo14038d = this.f32375b.mo14038d(continuation);
        return objMo14038d == Intrinsics.COROUTINE_SUSPENDED ? objMo14038d : Unit.f29502a;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: h */
    public Object mo14217h(String str, int i, Continuation<? super GetListResponse<Song>> continuation) {
        return this.f32374a.m14155h(str, i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SearchRepository
    /* JADX INFO: renamed from: i */
    public Object mo14218i(int i, Continuation<? super List<KeywordEntity>> continuation) {
        return this.f32375b.mo14036b(continuation);
    }
}
