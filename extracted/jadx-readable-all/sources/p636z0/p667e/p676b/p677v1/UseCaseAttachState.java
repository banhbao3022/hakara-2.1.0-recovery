package p636z0.p667e.p676b.p677v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p636z0.p667e.p676b.Logger8;

/* JADX INFO: renamed from: z0.e.b.v1.n1, reason: use source file name */
/* JADX INFO: compiled from: UseCaseAttachState.java */
/* JADX INFO: loaded from: classes.dex */
public final class UseCaseAttachState {

    /* JADX INFO: renamed from: a */
    public final String f36221a;

    /* JADX INFO: renamed from: b */
    public final Map<String, b> f36222b = new HashMap();

    /* JADX INFO: renamed from: z0.e.b.v1.n1$a */
    /* JADX INFO: compiled from: UseCaseAttachState.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo15380a(b bVar);
    }

    /* JADX INFO: renamed from: z0.e.b.v1.n1$b */
    /* JADX INFO: compiled from: UseCaseAttachState.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final SessionConfig f36223a;

        /* JADX INFO: renamed from: b */
        public boolean f36224b = false;

        /* JADX INFO: renamed from: c */
        public boolean f36225c = false;

        public b(SessionConfig sessionConfig) {
            this.f36223a = sessionConfig;
        }
    }

    public UseCaseAttachState(String str) {
        this.f36221a = str;
    }

    /* JADX INFO: renamed from: a */
    public SessionConfig.f m15398a() {
        SessionConfig.f fVar = new SessionConfig.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f36222b.entrySet()) {
            b value = entry.getValue();
            if (value.f36224b) {
                fVar.m15378a(value.f36223a);
                arrayList.add(entry.getKey());
            }
        }
        Logger8.m15272a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f36221a, null);
        return fVar;
    }

    /* JADX INFO: renamed from: b */
    public Collection<SessionConfig> m15399b() {
        return Collections.unmodifiableCollection(m15400c(new a() { // from class: z0.e.b.v1.j
            @Override // p636z0.p667e.p676b.p677v1.UseCaseAttachState.a
            /* JADX INFO: renamed from: a */
            public final boolean mo15380a(UseCaseAttachState.b bVar) {
                return bVar.f36224b;
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public final Collection<SessionConfig> m15400c(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f36222b.entrySet()) {
            if (aVar.mo15380a(entry.getValue())) {
                arrayList.add(entry.getValue().f36223a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public boolean m15401d(String str) {
        if (this.f36222b.containsKey(str)) {
            return this.f36222b.get(str).f36224b;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m15402e(String str, SessionConfig sessionConfig) {
        b bVar = this.f36222b.get(str);
        if (bVar == null) {
            bVar = new b(sessionConfig);
            this.f36222b.put(str, bVar);
        }
        bVar.f36225c = true;
    }

    /* JADX INFO: renamed from: f */
    public void m15403f(String str, SessionConfig sessionConfig) {
        b bVar = this.f36222b.get(str);
        if (bVar == null) {
            bVar = new b(sessionConfig);
            this.f36222b.put(str, bVar);
        }
        bVar.f36224b = true;
    }

    /* JADX INFO: renamed from: g */
    public void m15404g(String str) {
        if (this.f36222b.containsKey(str)) {
            b bVar = this.f36222b.get(str);
            bVar.f36225c = false;
            if (bVar.f36224b) {
                return;
            }
            this.f36222b.remove(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m15405h(String str, SessionConfig sessionConfig) {
        if (this.f36222b.containsKey(str)) {
            b bVar = new b(sessionConfig);
            b bVar2 = this.f36222b.get(str);
            bVar.f36224b = bVar2.f36224b;
            bVar.f36225c = bVar2.f36225c;
            this.f36222b.put(str, bVar);
        }
    }
}
