package p007c.p165l.p166h0.p171e0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.l, reason: use source file name */
/* JADX INFO: compiled from: SessionInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class SessionInfo {

    /* JADX INFO: renamed from: a */
    public Long f4747a;

    /* JADX INFO: renamed from: b */
    public Long f4748b;

    /* JADX INFO: renamed from: c */
    public int f4749c;

    /* JADX INFO: renamed from: d */
    public Long f4750d;

    /* JADX INFO: renamed from: e */
    public SourceApplicationInfo f4751e;

    /* JADX INFO: renamed from: f */
    public UUID f4752f;

    public SessionInfo(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    /* JADX INFO: renamed from: a */
    public void m2326a() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i).edit();
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f4747a.longValue());
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f4748b.longValue());
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f4749c);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f4752f.toString());
        editorEdit.apply();
        SourceApplicationInfo sourceApplicationInfo = this.f4751e;
        if (sourceApplicationInfo != null) {
            Objects.requireNonNull(sourceApplicationInfo);
            Validate.m2479h();
            SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i).edit();
            editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", sourceApplicationInfo.f4754a);
            editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", sourceApplicationInfo.f4755b);
            editorEdit2.apply();
        }
    }

    public SessionInfo(Long l, Long l2, UUID uuid) {
        this.f4747a = l;
        this.f4748b = l2;
        this.f4752f = uuid;
    }
}
