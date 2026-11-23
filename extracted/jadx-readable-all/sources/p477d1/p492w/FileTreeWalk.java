package p477d1.p492w;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import p477d1.NoWhenBranchMatchedException;
import p477d1.Unit;
import p477d1.p480c0.Sequence;
import p477d1.p483s.AbstractIterator3;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.w.d, reason: use source file name */
/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FileTreeWalk implements Sequence<File> {

    /* JADX INFO: renamed from: a */
    public final File f29560a;

    /* JADX INFO: renamed from: b */
    public final FileTreeWalk2 f29561b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6164l<File, Boolean> f29562c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6164l<File, Unit> f29563d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6168p<File, IOException, Unit> f29564e;

    /* JADX INFO: renamed from: f */
    public final int f29565f;

    /* JADX INFO: renamed from: d1.w.d$a */
    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            Intrinsics2.m13089e(file, "rootDir");
        }
    }

    /* JADX INFO: renamed from: d1.w.d$b */
    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public final class b extends AbstractIterator3<File> {

        /* JADX INFO: renamed from: h */
        public final ArrayDeque<c> f29566h;

        /* JADX INFO: renamed from: d1.w.d$b$a */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class a extends a {

            /* JADX INFO: renamed from: b */
            public boolean f29568b;

            /* JADX INFO: renamed from: c */
            public File[] f29569c;

            /* JADX INFO: renamed from: d */
            public int f29570d;

            /* JADX INFO: renamed from: e */
            public boolean f29571e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ b f29572f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                Intrinsics2.m13089e(file, "rootDir");
                this.f29572f = bVar;
            }

            @Override // p477d1.p492w.FileTreeWalk.c
            /* JADX INFO: renamed from: a */
            public File mo13077a() {
                if (!this.f29571e && this.f29569c == null) {
                    InterfaceC6164l<File, Boolean> interfaceC6164l = FileTreeWalk.this.f29562c;
                    if (interfaceC6164l != null && !interfaceC6164l.mo3b(this.f29578a).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = this.f29578a.listFiles();
                    this.f29569c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        InterfaceC6168p<File, IOException, Unit> interfaceC6168p = FileTreeWalk.this.f29564e;
                        if (interfaceC6168p != null) {
                            interfaceC6168p.mo5l(this.f29578a, new Exceptions2(this.f29578a, null, "Cannot list files in a directory", 2, null));
                        }
                        this.f29571e = true;
                    }
                }
                File[] fileArr = this.f29569c;
                if (fileArr != null) {
                    int i = this.f29570d;
                    Intrinsics2.m13087c(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f29569c;
                        Intrinsics2.m13087c(fileArr2);
                        int i2 = this.f29570d;
                        this.f29570d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f29568b) {
                    this.f29568b = true;
                    return this.f29578a;
                }
                InterfaceC6164l<File, Unit> interfaceC6164l2 = FileTreeWalk.this.f29563d;
                if (interfaceC6164l2 != null) {
                    interfaceC6164l2.mo3b(this.f29578a);
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: d1.w.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class C8538b extends c {

            /* JADX INFO: renamed from: b */
            public boolean f29573b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8538b(b bVar, File file) {
                super(file);
                Intrinsics2.m13089e(file, "rootFile");
            }

            @Override // p477d1.p492w.FileTreeWalk.c
            /* JADX INFO: renamed from: a */
            public File mo13077a() {
                if (this.f29573b) {
                    return null;
                }
                this.f29573b = true;
                return this.f29578a;
            }
        }

        /* JADX INFO: renamed from: d1.w.d$b$c */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class c extends a {

            /* JADX INFO: renamed from: b */
            public boolean f29574b;

            /* JADX INFO: renamed from: c */
            public File[] f29575c;

            /* JADX INFO: renamed from: d */
            public int f29576d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ b f29577e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                Intrinsics2.m13089e(file, "rootDir");
                this.f29577e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // p477d1.p492w.FileTreeWalk.c
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File mo13077a() {
                /*
                    r10 = this;
                    boolean r0 = r10.f29574b
                    r1 = 0
                    if (r0 != 0) goto L22
                    d1.w.d$b r0 = r10.f29577e
                    d1.w.d r0 = p477d1.p492w.FileTreeWalk.this
                    d1.x.b.l<java.io.File, java.lang.Boolean> r0 = r0.f29562c
                    if (r0 == 0) goto L1c
                    java.io.File r2 = r10.f29578a
                    java.lang.Object r0 = r0.mo3b(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L1c
                    return r1
                L1c:
                    r0 = 1
                    r10.f29574b = r0
                    java.io.File r0 = r10.f29578a
                    return r0
                L22:
                    java.io.File[] r0 = r10.f29575c
                    if (r0 == 0) goto L40
                    int r2 = r10.f29576d
                    p477d1.p493x.p495c.Intrinsics2.m13087c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L2f
                    goto L40
                L2f:
                    d1.w.d$b r0 = r10.f29577e
                    d1.w.d r0 = p477d1.p492w.FileTreeWalk.this
                    d1.x.b.l<java.io.File, d1.q> r0 = r0.f29563d
                    if (r0 == 0) goto L3f
                    java.io.File r2 = r10.f29578a
                    java.lang.Object r0 = r0.mo3b(r2)
                    d1.q r0 = (p477d1.Unit) r0
                L3f:
                    return r1
                L40:
                    java.io.File[] r0 = r10.f29575c
                    if (r0 != 0) goto L86
                    java.io.File r0 = r10.f29578a
                    java.io.File[] r0 = r0.listFiles()
                    r10.f29575c = r0
                    if (r0 != 0) goto L6b
                    d1.w.d$b r0 = r10.f29577e
                    d1.w.d r0 = p477d1.p492w.FileTreeWalk.this
                    d1.x.b.p<java.io.File, java.io.IOException, d1.q> r0 = r0.f29564e
                    if (r0 == 0) goto L6b
                    java.io.File r2 = r10.f29578a
                    d1.w.a r9 = new d1.w.a
                    java.io.File r4 = r10.f29578a
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    java.lang.Object r0 = r0.mo5l(r2, r9)
                    d1.q r0 = (p477d1.Unit) r0
                L6b:
                    java.io.File[] r0 = r10.f29575c
                    if (r0 == 0) goto L75
                    p477d1.p493x.p495c.Intrinsics2.m13087c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L86
                L75:
                    d1.w.d$b r0 = r10.f29577e
                    d1.w.d r0 = p477d1.p492w.FileTreeWalk.this
                    d1.x.b.l<java.io.File, d1.q> r0 = r0.f29563d
                    if (r0 == 0) goto L85
                    java.io.File r2 = r10.f29578a
                    java.lang.Object r0 = r0.mo3b(r2)
                    d1.q r0 = (p477d1.Unit) r0
                L85:
                    return r1
                L86:
                    java.io.File[] r0 = r10.f29575c
                    p477d1.p493x.p495c.Intrinsics2.m13087c(r0)
                    int r1 = r10.f29576d
                    int r2 = r1 + 1
                    r10.f29576d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p477d1.p492w.FileTreeWalk.b.c.mo13077a():java.io.File");
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f29566h = arrayDeque;
            if (FileTreeWalk.this.f29560a.isDirectory()) {
                arrayDeque.push(m13076b(FileTreeWalk.this.f29560a));
            } else if (FileTreeWalk.this.f29560a.isFile()) {
                arrayDeque.push(new C8538b(this, FileTreeWalk.this.f29560a));
            } else {
                this.f29506f = 3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.io.File, java.lang.Object] */
        @Override // p477d1.p483s.AbstractIterator3
        /* JADX INFO: renamed from: a */
        public void mo13025a() {
            T tMo13077a;
            while (true) {
                c cVarPeek = this.f29566h.peek();
                if (cVarPeek == null) {
                    tMo13077a = 0;
                    break;
                }
                tMo13077a = cVarPeek.mo13077a();
                if (tMo13077a == 0) {
                    this.f29566h.pop();
                } else if (Intrinsics2.m13085a(tMo13077a, cVarPeek.f29578a) || !tMo13077a.isDirectory() || this.f29566h.size() >= FileTreeWalk.this.f29565f) {
                    break;
                } else {
                    this.f29566h.push(m13076b(tMo13077a));
                }
            }
            if (tMo13077a == 0) {
                this.f29506f = 3;
            } else {
                this.f29507g = tMo13077a;
                this.f29506f = 1;
            }
        }

        /* JADX INFO: renamed from: b */
        public final a m13076b(File file) {
            int iOrdinal = FileTreeWalk.this.f29561b.ordinal();
            if (iOrdinal == 0) {
                return new c(this, file);
            }
            if (iOrdinal == 1) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d1.w.d$c */
    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final File f29578a;

        public c(File file) {
            Intrinsics2.m13089e(file, "root");
            this.f29578a = file;
        }

        /* JADX INFO: renamed from: a */
        public abstract File mo13077a();
    }

    public FileTreeWalk(File file, FileTreeWalk2 fileTreeWalk2) {
        Intrinsics2.m13089e(file, "start");
        Intrinsics2.m13089e(fileTreeWalk2, "direction");
        this.f29560a = file;
        this.f29561b = fileTreeWalk2;
        this.f29562c = null;
        this.f29563d = null;
        this.f29564e = null;
        this.f29565f = Integer.MAX_VALUE;
    }

    @Override // p477d1.p480c0.Sequence
    public Iterator<File> iterator() {
        return new b();
    }

    public /* synthetic */ FileTreeWalk(File file, FileTreeWalk2 fileTreeWalk2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? FileTreeWalk2.TOP_DOWN : fileTreeWalk2);
    }
}
