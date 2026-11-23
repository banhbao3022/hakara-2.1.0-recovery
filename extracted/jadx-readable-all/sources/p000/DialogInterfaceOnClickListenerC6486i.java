package p000;

import android.content.DialogInterface;
import p477d1.p493x.p494b.InterfaceC6153a;

/* JADX INFO: renamed from: i */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC6486i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f30757f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f30758g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f30759h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f30760i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f30761j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f30762k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f30763l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f30764m;

    public DialogInterfaceOnClickListenerC6486i(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        this.f30757f = i;
        this.f30758g = obj;
        this.f30759h = obj2;
        this.f30760i = obj3;
        this.f30761j = obj4;
        this.f30762k = obj5;
        this.f30763l = obj6;
        this.f30764m = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f30757f;
        if (i2 == 0) {
            InterfaceC6153a interfaceC6153a = (InterfaceC6153a) this.f30761j;
            if (interfaceC6153a != null) {
                return;
            }
            return;
        }
        if (i2 != 1) {
            throw null;
        }
        InterfaceC6153a interfaceC6153a2 = (InterfaceC6153a) this.f30763l;
        if (interfaceC6153a2 != null) {
        }
    }
}
