package p007c.p165l.p178k0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p007c.p165l.p182l0.GetTokenClient;
import p007c.p165l.p182l0.GetTokenLoginMethodHandler;
import p007c.p165l.p182l0.GetTokenLoginMethodHandler2;
import p007c.p165l.p182l0.LoginClient;
import p007c.p165l.p182l0.LoginFragment;

/* JADX INFO: renamed from: c.l.k0.a0, reason: use source file name */
/* JADX INFO: compiled from: PlatformServiceClient.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformServiceClient implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f4877a;

    /* JADX INFO: renamed from: b */
    public final Handler f4878b;

    /* JADX INFO: renamed from: c */
    public b f4879c;

    /* JADX INFO: renamed from: d */
    public boolean f4880d;

    /* JADX INFO: renamed from: e */
    public Messenger f4881e;

    /* JADX INFO: renamed from: f */
    public int f4882f;

    /* JADX INFO: renamed from: g */
    public int f4883g;

    /* JADX INFO: renamed from: h */
    public final String f4884h;

    /* JADX INFO: renamed from: i */
    public final int f4885i;

    /* JADX INFO: renamed from: c.l.k0.a0$a */
    /* JADX INFO: compiled from: PlatformServiceClient.java */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PlatformServiceClient platformServiceClient = PlatformServiceClient.this;
            Objects.requireNonNull(platformServiceClient);
            if (message.what == platformServiceClient.f4883g) {
                Bundle data = message.getData();
                if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                    platformServiceClient.m2415a(null);
                } else {
                    platformServiceClient.m2415a(data);
                }
                try {
                    platformServiceClient.f4877a.unbindService(platformServiceClient);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.l.k0.a0$b */
    /* JADX INFO: compiled from: PlatformServiceClient.java */
    public interface b {
    }

    public PlatformServiceClient(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f4877a = applicationContext != null ? applicationContext : context;
        this.f4882f = i;
        this.f4883g = i2;
        this.f4884h = str;
        this.f4885i = i3;
        this.f4878b = new a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2415a(Bundle bundle) {
        if (this.f4880d) {
            this.f4880d = false;
            b bVar = this.f4879c;
            if (bVar != null) {
                GetTokenLoginMethodHandler.a aVar = (GetTokenLoginMethodHandler.a) bVar;
                GetTokenLoginMethodHandler getTokenLoginMethodHandler = GetTokenLoginMethodHandler.this;
                LoginClient.d dVar = aVar.f5111a;
                GetTokenClient getTokenClient = getTokenLoginMethodHandler.f5110h;
                if (getTokenClient != null) {
                    getTokenClient.f4879c = null;
                }
                getTokenLoginMethodHandler.f5110h = null;
                LoginClient.b bVar2 = getTokenLoginMethodHandler.f5163g.f5120j;
                if (bVar2 != null) {
                    ((LoginFragment.b) bVar2).f5151a.setVisibility(8);
                }
                if (bundle != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    Set<String> set = dVar.f5127g;
                    if (stringArrayList != null && (set == null || stringArrayList.containsAll(set))) {
                        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string != null && !string.isEmpty()) {
                            getTokenLoginMethodHandler.m2571k(dVar, bundle);
                            return;
                        }
                        LoginClient.b bVar3 = getTokenLoginMethodHandler.f5163g.f5120j;
                        if (bVar3 != null) {
                            ((LoginFragment.b) bVar3).f5151a.setVisibility(0);
                        }
                        Utility.m2453l(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new GetTokenLoginMethodHandler2(getTokenLoginMethodHandler, bundle, dVar));
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        getTokenLoginMethodHandler.m2596a("new_permissions", TextUtils.join(",", hashSet));
                    }
                    Validate.m2477f(hashSet, "permissions");
                    dVar.f5127g = hashSet;
                }
                getTokenLoginMethodHandler.f5163g.m2582l();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2416b(Bundle bundle);

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4881e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f4884h);
        mo2416b(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f4882f);
        messageObtain.arg1 = this.f4885i;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f4878b);
        try {
            this.f4881e.send(messageObtain);
        } catch (RemoteException unused) {
            m2415a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f4881e = null;
        try {
            this.f4877a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m2415a(null);
    }
}
