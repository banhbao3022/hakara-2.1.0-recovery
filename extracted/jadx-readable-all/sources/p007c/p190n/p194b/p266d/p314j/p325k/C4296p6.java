package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.k.p6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4296p6<T> implements InterfaceC4431z6<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4240l6 f23402a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4269n7<?, ?> f23403b;

    /* JADX INFO: renamed from: c */
    public final boolean f23404c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4308q4<?> f23405d;

    public C4296p6(AbstractC4269n7<?, ?> abstractC4269n7, AbstractC4308q4<?> abstractC4308q4, InterfaceC4240l6 interfaceC4240l6) {
        this.f23403b = abstractC4269n7;
        this.f23404c = abstractC4308q4.mo10165h(interfaceC4240l6);
        this.f23405d = abstractC4308q4;
        this.f23402a = interfaceC4240l6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: a */
    public final int mo10055a(T t) {
        int iHashCode = this.f23403b.mo10086k(t).hashCode();
        return this.f23404c ? (iHashCode * 53) + this.f23405d.mo10159b(t).hashCode() : iHashCode;
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
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: b */
    public final int mo10056b(T t) {
        AbstractC4269n7<?, ?> abstractC4269n7 = this.f23403b;
        int iMo10093r = abstractC4269n7.mo10093r(abstractC4269n7.mo10086k(t)) + 0;
        if (!this.f23404c) {
            return iMo10093r;
        }
        C4364u4<T> c4364u4Mo10159b = this.f23405d.mo10159b(t);
        int iM10271k = 0;
        for (int i = 0; i < c4364u4Mo10159b.f23500b.m9350e(); i++) {
            iM10271k += C4364u4.m10271k(c4364u4Mo10159b.f23500b.m9349d(i));
        }
        Iterator<T> it = c4364u4Mo10159b.f23500b.m9352g().iterator();
        while (it.hasNext()) {
            iM10271k += C4364u4.m10271k((Map.Entry) it.next());
        }
        return iMo10093r + iM10271k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: c */
    public final void mo10057c(T t, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        Iterator itM10276l = this.f23405d.mo10159b(t).m10276l();
        while (itM10276l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM10276l.next();
            InterfaceC4390w4 interfaceC4390w4 = (InterfaceC4390w4) entry.getKey();
            if (interfaceC4390w4.mo9435b() != EnumC4172g8.MESSAGE || interfaceC4390w4.mo9437e() || interfaceC4390w4.mo9436c()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C4281o5) {
                ((C4266n4) interfaceC4158f8).m10028c(interfaceC4390w4.zza(), ((C4281o5) entry).f23384f.getValue().m10170c());
            } else {
                ((C4266n4) interfaceC4158f8).m10028c(interfaceC4390w4.zza(), entry.getValue());
            }
        }
        AbstractC4269n7<?, ?> abstractC4269n7 = this.f23403b;
        abstractC4269n7.mo10088m(abstractC4269n7.mo10086k(t), interfaceC4158f8);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: d */
    public final boolean mo10058d(T t) {
        return this.f23405d.mo10159b(t).m10277m();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: e */
    public final void mo10059e(T t) {
        this.f23403b.mo10092q(t);
        this.f23405d.mo10167j(t);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: f */
    public final boolean mo10060f(T t, T t2) {
        if (!this.f23403b.mo10086k(t).equals(this.f23403b.mo10086k(t2))) {
            return false;
        }
        if (this.f23404c) {
            return this.f23405d.mo10159b(t).equals(this.f23405d.mo10159b(t2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[EDGE_INSN: B:56:0x0095->B:34:0x0095 BREAK  A[LOOP:1: B:18:0x0050->B:61:0x0050], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: g */
    public final void mo10061g(T t, byte[] bArr, int i, int i2, C4389w3 c4389w3) throws IOException {
        AbstractC4099b5 abstractC4099b5 = (AbstractC4099b5) t;
        C4255m7 c4255m7M10010c = abstractC4099b5.zzb;
        if (c4255m7M10010c == C4255m7.f23317a) {
            c4255m7M10010c = C4255m7.m10010c();
            abstractC4099b5.zzb = c4255m7M10010c;
        }
        ((AbstractC4099b5.d) t).m9440s();
        AbstractC4099b5.f fVar = null;
        while (i < i2) {
            int iM5395l0 = C2622l.m5395l0(bArr, i, c4389w3);
            int i3 = c4389w3.f23583a;
            if (i3 == 11) {
                int i4 = 0;
                AbstractC4402x3 abstractC4402x3 = null;
                while (iM5395l0 < i2) {
                    iM5395l0 = C2622l.m5395l0(bArr, iM5395l0, c4389w3);
                    int i5 = c4389w3.f23583a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iM5395l0 = C2622l.m5335Z(i5, bArr, iM5395l0, i2, c4389w3);
                        } else {
                            iM5395l0 = C2622l.m5395l0(bArr, iM5395l0, c4389w3);
                            i4 = c4389w3.f23583a;
                            fVar = (AbstractC4099b5.f) this.f23405d.mo10161d(c4389w3.f23586d, this.f23402a, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (fVar != null) {
                                C4392w6 c4392w6 = C4392w6.f23587a;
                                throw new NoSuchMethodError();
                            }
                            if (i7 == 2) {
                                iM5395l0 = C2622l.m5343a3(bArr, iM5395l0, c4389w3);
                                abstractC4402x3 = (AbstractC4402x3) c4389w3.f23585c;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iM5395l0 = C2622l.m5335Z(i5, bArr, iM5395l0, i2, c4389w3);
                        }
                    }
                }
                if (abstractC4402x3 != null) {
                    c4255m7M10010c.m10011a((i4 << 3) | 2, abstractC4402x3);
                }
                i = iM5395l0;
            } else if ((i3 & 7) == 2) {
                fVar = (AbstractC4099b5.f) this.f23405d.mo10161d(c4389w3.f23586d, this.f23402a, i3 >>> 3);
                if (fVar != null) {
                    C4392w6 c4392w7 = C4392w6.f23587a;
                    throw new NoSuchMethodError();
                }
                i = C2622l.m5345b0(i3, bArr, iM5395l0, i2, c4255m7M10010c, c4389w3);
            } else {
                i = C2622l.m5335Z(i3, bArr, iM5395l0, i2, c4389w3);
            }
        }
        if (i != i2) {
            throw C4239l5.m10001g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:45:0x000c->B:53:?, LOOP_END, SYNTHETIC] */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: h */
    public final void mo10062h(T t, C4210j4 c4210j4, C4280o4 c4280o4) throws IOException {
        boolean zM9896o;
        AbstractC4269n7<?, ?> abstractC4269n7 = this.f23403b;
        AbstractC4308q4<?> abstractC4308q4 = this.f23405d;
        Object objMo10090o = abstractC4269n7.mo10090o(t);
        C4364u4<T> c4364u4Mo10166i = abstractC4308q4.mo10166i(t);
        while (c4210j4.m9884a() != Integer.MAX_VALUE) {
            try {
                int i = c4210j4.f23250b;
                if (i != 11) {
                    if ((i & 7) == 2) {
                        Object objMo10161d = abstractC4308q4.mo10161d(c4280o4, this.f23402a, i >>> 3);
                        if (objMo10161d != null) {
                            abstractC4308q4.mo10163f(c4210j4, objMo10161d, c4280o4, c4364u4Mo10166i);
                        } else {
                            zM9896o = abstractC4269n7.m10085j(objMo10090o, c4210j4);
                        }
                    } else {
                        zM9896o = c4210j4.m9896o();
                    }
                    if (!zM9896o) {
                        abstractC4269n7.mo10089n(t, objMo10090o);
                        return;
                    }
                } else {
                    int iM9875M = 0;
                    Object objMo10161d2 = null;
                    AbstractC4402x3 abstractC4402x3M9873K = null;
                    while (c4210j4.m9884a() != Integer.MAX_VALUE) {
                        int i2 = c4210j4.f23250b;
                        if (i2 == 16) {
                            iM9875M = c4210j4.m9875M();
                            objMo10161d2 = abstractC4308q4.mo10161d(c4280o4, this.f23402a, iM9875M);
                        } else if (i2 == 26) {
                            if (objMo10161d2 != null) {
                                abstractC4308q4.mo10163f(c4210j4, objMo10161d2, c4280o4, c4364u4Mo10166i);
                            } else {
                                abstractC4402x3M9873K = c4210j4.m9873K();
                            }
                        } else if (!c4210j4.m9896o()) {
                            break;
                        }
                    }
                    if (c4210j4.f23250b != 12) {
                        throw C4239l5.m9999e();
                    }
                    if (abstractC4402x3M9873K != null) {
                        if (objMo10161d2 != null) {
                            abstractC4308q4.mo10162e(abstractC4402x3M9873K, objMo10161d2, c4280o4, c4364u4Mo10166i);
                        } else {
                            abstractC4269n7.mo10080e(objMo10090o, iM9875M, abstractC4402x3M9873K);
                        }
                    }
                }
                zM9896o = true;
                if (!zM9896o) {
                    abstractC4269n7.mo10089n(t, objMo10090o);
                    return;
                }
            } catch (Throwable th) {
                abstractC4269n7.mo10089n(t, objMo10090o);
                throw th;
            }
        }
        abstractC4269n7.mo10089n(t, objMo10090o);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: i */
    public final void mo10063i(T t, T t2) {
        AbstractC4269n7<?, ?> abstractC4269n7 = this.f23403b;
        Class<?> cls = C4101b7.f23089a;
        abstractC4269n7.mo10083h(t, abstractC4269n7.mo10091p(abstractC4269n7.mo10086k(t), abstractC4269n7.mo10086k(t2)));
        if (this.f23404c) {
            C4101b7.m9472k(this.f23405d, t, t2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    public final T zza() {
        return (T) ((AbstractC4099b5.b) this.f23402a.mo9414E0()).m9432s();
    }
}
