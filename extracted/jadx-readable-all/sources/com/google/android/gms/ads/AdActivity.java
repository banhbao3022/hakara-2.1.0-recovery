package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh;
import p007c.p190n.p194b.p266d.p314j.p315a.ex2;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.tw2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: f */
    public InterfaceC2955dh f28461f;

    /* JADX INFO: renamed from: a */
    public final void m12635a() {
        InterfaceC2955dh interfaceC2955dh = this.f28461f;
        if (interfaceC2955dh != null) {
            try {
                interfaceC2955dh.mo4696q();
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4688d2(i, i2, intent);
            }
        } catch (Exception e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null && !interfaceC2955dh.mo4689f()) {
                return;
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            InterfaceC2955dh interfaceC2955dh2 = this.f28461f;
            if (interfaceC2955dh2 != null) {
                interfaceC2955dh2.mo4685c();
            }
        } catch (RemoteException e2) {
            C2622l.m5271J3("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4674H(new BinderC2800b(configuration));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ex2 ex2Var = gx2.f14692a.f14694c;
        Objects.requireNonNull(ex2Var);
        tw2 tw2Var = new tw2(ex2Var, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            C2622l.m5408n3("useClientJar flag not found in activity intent extras.");
        }
        InterfaceC2955dh interfaceC2955dhM6891d = tw2Var.m6891d(this, booleanExtra);
        this.f28461f = interfaceC2955dhM6891d;
        if (interfaceC2955dhM6891d == null) {
            C2622l.m5271J3("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC2955dhM6891d.mo4686c6(bundle);
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4694l();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4692j();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4691i();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4693k();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4682Y1(bundle);
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4690h();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4695n();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC2955dh interfaceC2955dh = this.f28461f;
            if (interfaceC2955dh != null) {
                interfaceC2955dh.mo4687d();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        m12635a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        m12635a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m12635a();
    }
}
