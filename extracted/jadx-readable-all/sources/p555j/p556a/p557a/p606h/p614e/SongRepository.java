package p555j.p556a.p557a.p606h.p614e;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.remote.response.GetAnyResponse4;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetSongListResponse;
import p477d1.p485u.Continuation;

/* JADX INFO: renamed from: j.a.a.h.e.f, reason: use source file name */
/* JADX INFO: compiled from: SongRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface SongRepository {
    /* JADX INFO: renamed from: a */
    Object mo14219a(String str, Continuation<? super GetAnyResponse4> continuation);

    /* JADX INFO: renamed from: b */
    Object mo14220b(int i, Continuation<? super GetItemResponse<Song>> continuation);

    /* JADX INFO: renamed from: c */
    Object mo14221c(HashMap<String, String> map, Continuation<? super GetSongListResponse> continuation);
}
