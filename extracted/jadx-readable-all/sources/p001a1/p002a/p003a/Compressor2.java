package p001a1.p002a.p003a;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p001a1.p002a.p003a.p004e.Compression;
import p001a1.p002a.p003a.p004e.Constraint;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p492w.Exceptions3;
import p477d1.p492w.Exceptions4;
import p477d1.p492w.Exceptions5;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;

/* JADX INFO: renamed from: a1.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: Compressor.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(m13068c = "id.zelory.compressor.Compressor$compress$3", m13069f = "Compressor.kt", m13070l = {}, m13071m = "invokeSuspend")
public final class Compressor2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: j */
    public CoroutineScope f4j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC6164l f5k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Context f6l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ File f7m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Compressor2(InterfaceC6164l interfaceC6164l, Context context, File file, Continuation continuation) {
        super(2, continuation);
        this.f5k = interfaceC6164l;
        this.f6l = context;
        this.f7m = file;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13090f(continuation, "completion");
        Compressor2 compressor2 = new Compressor2(this.f5k, this.f6l, this.f7m, continuation);
        compressor2.f4j = (CoroutineScope) obj;
        return compressor2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        Continuation<? super File> continuation2 = continuation;
        Intrinsics2.m13090f(continuation2, "completion");
        Compressor2 compressor2 = new Compressor2(this.f5k, this.f6l, this.f7m, continuation2);
        compressor2.f4j = coroutineScope;
        return compressor2.mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        C5729a.m12442O(obj);
        Compression compression = new Compression();
        this.f5k.mo3b(compression);
        Context context = this.f6l;
        File file = this.f7m;
        String str = Util2.f9a;
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(file, "imageFile");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        File cacheDir = context.getCacheDir();
        Intrinsics2.m13086b(cacheDir, "context.cacheDir");
        sb2.append(cacheDir.getPath());
        String str2 = Util2.f9a;
        sb2.append(str2);
        sb2.append("compressor");
        sb2.append(str2);
        sb.append(sb2.toString());
        sb.append(file.getName());
        File file2 = new File(sb.toString());
        Intrinsics2.m13089e(file, "$this$copyTo");
        Intrinsics2.m13089e(file2, "target");
        if (!file.exists()) {
            throw new Exceptions5(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists() && !file2.delete()) {
            throw new Exceptions3(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    Intrinsics2.m13089e(fileInputStream, "$this$copyTo");
                    Intrinsics2.m13089e(fileOutputStream, "out");
                    byte[] bArr = new byte[8192];
                    for (int i = fileInputStream.read(bArr); i >= 0; i = fileInputStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, i);
                    }
                    C5729a.m12455j(fileOutputStream, null);
                    C5729a.m12455j(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C5729a.m12455j(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    C5729a.m12455j(fileInputStream, th3);
                    throw th4;
                }
            }
        } else if (!file2.mkdirs()) {
            throw new Exceptions4(file, file2, "Failed to create target directory.");
        }
        for (Constraint constraint : compression.f10a) {
            while (!constraint.mo8b(file2)) {
                file2 = constraint.mo7a(file2);
            }
        }
        return file2;
    }
}
