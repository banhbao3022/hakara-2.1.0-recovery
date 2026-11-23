package p007c.p165l.p166h0;

import java.util.ArrayList;
import java.util.List;
import p007c.p165l.p178k0.AttributionIdentifiers;

/* JADX INFO: renamed from: c.l.h0.y, reason: use source file name */
/* JADX INFO: compiled from: SessionEventsState.java */
/* JADX INFO: loaded from: classes.dex */
public class SessionEventsState {

    /* JADX INFO: renamed from: a */
    public List<AppEvent> f4858a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<AppEvent> f4859b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f4860c;

    /* JADX INFO: renamed from: d */
    public AttributionIdentifiers f4861d;

    /* JADX INFO: renamed from: e */
    public String f4862e;

    public SessionEventsState(AttributionIdentifiers attributionIdentifiers, String str) {
        this.f4861d = attributionIdentifiers;
        this.f4862e = str;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2372a(AppEvent appEvent) {
        if (this.f4858a.size() + this.f4859b.size() >= 1000) {
            this.f4860c++;
        } else {
            this.f4858a.add(appEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized List<AppEvent> m2373b() {
        List<AppEvent> list;
        list = this.f4858a;
        this.f4858a = new ArrayList();
        return list;
    }
}
