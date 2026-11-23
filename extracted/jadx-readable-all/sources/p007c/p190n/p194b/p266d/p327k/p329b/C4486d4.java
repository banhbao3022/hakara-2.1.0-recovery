package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: c.n.b.d.k.b.d4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4486d4 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final C4611n9 f23826a;

    /* JADX INFO: renamed from: b */
    public boolean f23827b;

    /* JADX INFO: renamed from: c */
    public boolean f23828c;

    public C4486d4(C4611n9 c4611n9) {
        this.f23826a = c4611n9;
    }

    /* JADX INFO: renamed from: a */
    public final void m10494a() {
        this.f23826a.m10668P();
        this.f23826a.mo10686n().mo10381b();
        this.f23826a.mo10686n().mo10381b();
        if (this.f23827b) {
            this.f23826a.mo10684l().f24426n.m10811a("Unregistering connectivity change receiver");
            this.f23827b = false;
            this.f23828c = false;
            try {
                this.f23826a.f24201k.f24528b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f23826a.mo10684l().f24418f.m10812b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f23826a.m10668P();
        String action = intent.getAction();
        this.f23826a.mo10684l().f24426n.m10812b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f23826a.mo10684l().f24421i.m10812b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM10913u = this.f23826a.m10662J().m10913u();
        if (this.f23828c != zM10913u) {
            this.f23828c = zM10913u;
            this.f23826a.mo10686n().m10758v(new RunnableC4522g4(this, zM10913u));
        }
    }
}
