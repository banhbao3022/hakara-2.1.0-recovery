package p555j.p556a.p557a.p606h.p609c.p610a;

import java.util.List;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;

/* JADX INFO: renamed from: j.a.a.h.c.a.c, reason: use source file name */
/* JADX INFO: compiled from: RecordingDao.kt */
/* JADX INFO: loaded from: classes.dex */
public interface RecordingDao {
    /* JADX INFO: renamed from: a */
    Object mo14041a(long j2, Continuation<? super RecordingEntity> continuation);

    /* JADX INFO: renamed from: b */
    Object mo14042b(RecordingEntity recordingEntity, Continuation<? super Long> continuation);

    /* JADX INFO: renamed from: c */
    Object mo14043c(RecordingEntity recordingEntity, Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: d */
    Object mo14044d(Continuation<? super List<RecordingEntity>> continuation);

    /* JADX INFO: renamed from: e */
    Object mo14045e(long j2, Continuation<? super Unit> continuation);
}
