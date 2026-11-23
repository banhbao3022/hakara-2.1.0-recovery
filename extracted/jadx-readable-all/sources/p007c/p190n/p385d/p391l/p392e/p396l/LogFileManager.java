package p007c.p190n.p385d.p391l.p392e.p396l;

import android.content.Context;
import java.io.File;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.C5335t;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;

/* JADX INFO: renamed from: c.n.d.l.e.l.b, reason: use source file name */
/* JADX INFO: compiled from: LogFileManager.java */
/* JADX INFO: loaded from: classes.dex */
public class LogFileManager {

    /* JADX INFO: renamed from: a */
    public static final c f26649a = new c(null);

    /* JADX INFO: renamed from: b */
    public final Context f26650b;

    /* JADX INFO: renamed from: c */
    public final b f26651c;

    /* JADX INFO: renamed from: d */
    public FileLogStore f26652d;

    /* JADX INFO: renamed from: c.n.d.l.e.l.b$b */
    /* JADX INFO: compiled from: LogFileManager.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.n.d.l.e.l.b$c */
    /* JADX INFO: compiled from: LogFileManager.java */
    public static final class c implements FileLogStore {
        public c(a aVar) {
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
        /* JADX INFO: renamed from: a */
        public void mo11812a() {
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
        /* JADX INFO: renamed from: b */
        public String mo11813b() {
            return null;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
        /* JADX INFO: renamed from: c */
        public byte[] mo11814c() {
            return null;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
        /* JADX INFO: renamed from: d */
        public void mo11815d() {
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
        /* JADX INFO: renamed from: e */
        public void mo11816e(long j2, String str) {
        }
    }

    public LogFileManager(Context context, b bVar) {
        this(context, bVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m11817a(String str) {
        this.f26652d.mo11812a();
        this.f26652d = f26649a;
        if (str == null) {
            return;
        }
        if (!CommonUtils.m11746i(this.f26650b, "com.crashlytics.CollectCustomLogs", true)) {
            Logger4.f26421a.m11713b("Preferences requested no custom logs. Aborting log file creation.");
        } else {
            this.f26652d = new QueueFileLogStore2(new File(((C5335t.j) this.f26651c).m11806a(), outline.m1600v("crashlytics-userlog-", str, ".temp")), 65536);
        }
    }

    public LogFileManager(Context context, b bVar, String str) {
        this.f26650b = context;
        this.f26651c = bVar;
        this.f26652d = f26649a;
        m11817a(str);
    }
}
