package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2608e;
import p007c.p190n.p194b.p266d.p298f.C2618j;
import p007c.p190n.p194b.p266d.p298f.p302q.C2723e;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.d1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2652d1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final C2655e1 f11649f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC2649c1 f11650g;

    public RunnableC2652d1(AbstractDialogInterfaceOnCancelListenerC2649c1 abstractDialogInterfaceOnCancelListenerC2649c1, C2655e1 c2655e1) {
        this.f11650g = abstractDialogInterfaceOnCancelListenerC2649c1;
        this.f11649f = c2655e1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11650g.f11644g) {
            C2602b c2602b = this.f11649f.f11653b;
            if (c2602b.m5196H()) {
                AbstractDialogInterfaceOnCancelListenerC2649c1 abstractDialogInterfaceOnCancelListenerC2649c1 = this.f11650g;
                InterfaceC2668j interfaceC2668j = abstractDialogInterfaceOnCancelListenerC2649c1.f28672f;
                Activity activityM12663b = abstractDialogInterfaceOnCancelListenerC2649c1.m12663b();
                PendingIntent pendingIntent = c2602b.f11554i;
                int i = this.f11649f.f11652a;
                int i2 = GoogleApiActivity.f28644f;
                Intent intent = new Intent(activityM12663b, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                interfaceC2668j.startActivityForResult(intent, 1);
                return;
            }
            if (this.f11650g.f11647j.m5208e(c2602b.f11553h)) {
                AbstractDialogInterfaceOnCancelListenerC2649c1 abstractDialogInterfaceOnCancelListenerC2649c2 = this.f11650g;
                C2608e c2608e = abstractDialogInterfaceOnCancelListenerC2649c2.f11647j;
                Activity activityM12663b2 = abstractDialogInterfaceOnCancelListenerC2649c2.m12663b();
                AbstractDialogInterfaceOnCancelListenerC2649c1 abstractDialogInterfaceOnCancelListenerC2649c3 = this.f11650g;
                c2608e.m5211j(activityM12663b2, abstractDialogInterfaceOnCancelListenerC2649c3.f28672f, c2602b.f11553h, abstractDialogInterfaceOnCancelListenerC2649c3);
                return;
            }
            if (c2602b.f11553h != 18) {
                this.f11650g.mo5507i(c2602b, this.f11649f.f11652a);
                return;
            }
            Activity activityM12663b3 = this.f11650g.m12663b();
            AbstractDialogInterfaceOnCancelListenerC2649c1 abstractDialogInterfaceOnCancelListenerC2649c4 = this.f11650g;
            ProgressBar progressBar = new ProgressBar(activityM12663b3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityM12663b3);
            builder.setView(progressBar);
            builder.setMessage(C2723e.m5588b(activityM12663b3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            C2608e.m5204h(activityM12663b3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", abstractDialogInterfaceOnCancelListenerC2649c4);
            AbstractDialogInterfaceOnCancelListenerC2649c1 abstractDialogInterfaceOnCancelListenerC2649c5 = this.f11650g;
            C2608e c2608e2 = abstractDialogInterfaceOnCancelListenerC2649c5.f11647j;
            Context applicationContext = abstractDialogInterfaceOnCancelListenerC2649c5.m12663b().getApplicationContext();
            C2658f1 c2658f1 = new C2658f1(this, alertDialogCreate);
            Objects.requireNonNull(c2608e2);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            C2663h0 c2663h0 = new C2663h0(c2658f1);
            applicationContext.registerReceiver(c2663h0, intentFilter);
            c2663h0.f11699a = applicationContext;
            if (C2618j.m5217c(applicationContext, "com.google.android.gms")) {
                return;
            }
            c2658f1.mo5512a();
            c2663h0.m5538a();
        }
    }
}
