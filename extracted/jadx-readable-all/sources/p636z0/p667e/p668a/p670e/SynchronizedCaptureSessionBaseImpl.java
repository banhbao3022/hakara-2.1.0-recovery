package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompat;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.o1, reason: use source file name */
/* JADX INFO: compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class SynchronizedCaptureSessionBaseImpl extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl2 f35629a;

    public SynchronizedCaptureSessionBaseImpl(SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2) {
        this.f35629a = synchronizedCaptureSessionBaseImpl2;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35629a;
        if (synchronizedCaptureSessionBaseImpl2.f35643g == null) {
            synchronizedCaptureSessionBaseImpl2.f35643g = new CameraCaptureSessionCompat(cameraCaptureSession, synchronizedCaptureSessionBaseImpl2.f35639c);
        }
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl3 = this.f35629a;
        synchronizedCaptureSessionBaseImpl3.f35642f.mo15154k(synchronizedCaptureSessionBaseImpl3);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35629a;
        if (synchronizedCaptureSessionBaseImpl2.f35643g == null) {
            synchronizedCaptureSessionBaseImpl2.f35643g = new CameraCaptureSessionCompat(cameraCaptureSession, synchronizedCaptureSessionBaseImpl2.f35639c);
        }
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl3 = this.f35629a;
        synchronizedCaptureSessionBaseImpl3.f35642f.mo15155l(synchronizedCaptureSessionBaseImpl3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35629a;
        if (synchronizedCaptureSessionBaseImpl2.f35643g == null) {
            synchronizedCaptureSessionBaseImpl2.f35643g = new CameraCaptureSessionCompat(cameraCaptureSession, synchronizedCaptureSessionBaseImpl2.f35639c);
        }
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl3 = this.f35629a;
        synchronizedCaptureSessionBaseImpl3.mo15092m(synchronizedCaptureSessionBaseImpl3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CallbackToFutureAdapter<Void> callbackToFutureAdapter;
        try {
            SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35629a;
            if (synchronizedCaptureSessionBaseImpl2.f35643g == null) {
                synchronizedCaptureSessionBaseImpl2.f35643g = new CameraCaptureSessionCompat(cameraCaptureSession, synchronizedCaptureSessionBaseImpl2.f35639c);
            }
            SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl3 = this.f35629a;
            synchronizedCaptureSessionBaseImpl3.mo15093n(synchronizedCaptureSessionBaseImpl3);
            synchronized (this.f35629a.f35637a) {
                C8162a.m16063h(this.f35629a.f35645i, "OpenCaptureSession completer should not null");
                SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl4 = this.f35629a;
                callbackToFutureAdapter = synchronizedCaptureSessionBaseImpl4.f35645i;
                synchronizedCaptureSessionBaseImpl4.f35645i = null;
            }
        } finally {
            synchronized (this.f35629a.f35637a) {
                C8162a.m16063h(this.f35629a.f35645i, "OpenCaptureSession completer should not null");
                SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl5 = this.f35629a;
                callbackToFutureAdapter = synchronizedCaptureSessionBaseImpl5.f35645i;
                synchronizedCaptureSessionBaseImpl5.f35645i = null;
                callbackToFutureAdapter.m15661c(new IllegalStateException("onConfigureFailed"));
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CallbackToFutureAdapter<Void> callbackToFutureAdapter;
        try {
            SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35629a;
            if (synchronizedCaptureSessionBaseImpl2.f35643g == null) {
                synchronizedCaptureSessionBaseImpl2.f35643g = new CameraCaptureSessionCompat(cameraCaptureSession, synchronizedCaptureSessionBaseImpl2.f35639c);
            }
            SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl3 = this.f35629a;
            synchronizedCaptureSessionBaseImpl3.mo15094o(synchronizedCaptureSessionBaseImpl3);
            synchronized (this.f35629a.f35637a) {
                C8162a.m16063h(this.f35629a.f35645i, "OpenCaptureSession completer should not null");
                SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl4 = this.f35629a;
                callbackToFutureAdapter = synchronizedCaptureSessionBaseImpl4.f35645i;
                synchronizedCaptureSessionBaseImpl4.f35645i = null;
            }
        } finally {
            synchronized (this.f35629a.f35637a) {
                C8162a.m16063h(this.f35629a.f35645i, "OpenCaptureSession completer should not null");
                SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl5 = this.f35629a;
                callbackToFutureAdapter = synchronizedCaptureSessionBaseImpl5.f35645i;
                synchronizedCaptureSessionBaseImpl5.f35645i = null;
                callbackToFutureAdapter.m15659a(null);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35629a;
        if (synchronizedCaptureSessionBaseImpl2.f35643g == null) {
            synchronizedCaptureSessionBaseImpl2.f35643g = new CameraCaptureSessionCompat(cameraCaptureSession, synchronizedCaptureSessionBaseImpl2.f35639c);
        }
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl3 = this.f35629a;
        synchronizedCaptureSessionBaseImpl3.f35642f.mo15095p(synchronizedCaptureSessionBaseImpl3);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35629a;
        if (synchronizedCaptureSessionBaseImpl2.f35643g == null) {
            synchronizedCaptureSessionBaseImpl2.f35643g = new CameraCaptureSessionCompat(cameraCaptureSession, synchronizedCaptureSessionBaseImpl2.f35639c);
        }
        SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl3 = this.f35629a;
        synchronizedCaptureSessionBaseImpl3.f35642f.mo15156q(synchronizedCaptureSessionBaseImpl3, surface);
    }
}
