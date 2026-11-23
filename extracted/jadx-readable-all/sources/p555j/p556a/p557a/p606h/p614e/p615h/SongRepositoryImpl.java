package p555j.p556a.p557a.p606h.p614e.p615h;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.remote.response.GetAnyResponse4;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetSongListResponse;
import p477d1.p485u.Continuation;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.SongRepository;

/* JADX INFO: renamed from: j.a.a.h.e.h.f, reason: use source file name */
/* JADX INFO: compiled from: SongRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongRepositoryImpl implements SongRepository {

    /* JADX INFO: renamed from: a */
    public final ApiService f32376a;

    public SongRepositoryImpl(ApiService apiService) {
        Intrinsics2.m13089e(apiService, "api");
        this.f32376a = apiService;
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SongRepository
    /* JADX INFO: renamed from: a */
    public Object mo14219a(String str, Continuation<? super GetAnyResponse4> continuation) {
        return this.f32376a.m14131O(str, 1, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SongRepository
    /* JADX INFO: renamed from: b */
    public Object mo14220b(int i, Continuation<? super GetItemResponse<Song>> continuation) {
        return this.f32376a.m14140X(i, continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p614e.SongRepository
    /* JADX INFO: renamed from: c */
    public Object mo14221c(HashMap<String, String> map, Continuation<? super GetSongListResponse> continuation) {
        return this.f32376a.m14134R(map, continuation);
    }
}
