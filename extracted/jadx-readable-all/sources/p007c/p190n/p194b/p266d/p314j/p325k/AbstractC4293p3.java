package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4293p3;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3;

/* JADX INFO: renamed from: c.n.b.d.j.k.p3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4293p3<MessageType extends AbstractC4293p3<MessageType, BuilderType>, BuilderType extends AbstractC4321r3<MessageType, BuilderType>> implements InterfaceC4240l6 {
    public int zza = 0;

    /* JADX INFO: renamed from: c */
    public static <T> void m10138c(Iterable<T> iterable, List<? super T> list) {
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(iterable);
        if (iterable instanceof InterfaceC4337s5) {
            List<?> listMo10119a = ((InterfaceC4337s5) iterable).mo10119a();
            InterfaceC4337s5 interfaceC4337s5 = (InterfaceC4337s5) list;
            int size = list.size();
            for (Object obj : listMo10119a) {
                if (obj == null) {
                    int size2 = interfaceC4337s5.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = interfaceC4337s5.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        interfaceC4337s5.remove(size3);
                    }
                } else if (obj instanceof AbstractC4402x3) {
                    interfaceC4337s5.mo10121o((AbstractC4402x3) obj);
                } else {
                    interfaceC4337s5.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC4366u6) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(t);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4240l6
    /* JADX INFO: renamed from: a */
    public final AbstractC4402x3 mo10003a() {
        try {
            AbstractC4099b5 abstractC4099b5 = (AbstractC4099b5) this;
            int iMo9420i = abstractC4099b5.mo9420i();
            AbstractC4402x3 abstractC4402x3 = AbstractC4402x3.f23614f;
            byte[] bArr = new byte[iMo9420i];
            Logger logger = AbstractC4238l4.f23285a;
            AbstractC4238l4.b bVar = new AbstractC4238l4.b(bArr, iMo9420i);
            abstractC4099b5.mo9416d(bVar);
            if (bVar.mo9975a() == 0) {
                return new C4126d4(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m10139f() {
        try {
            AbstractC4099b5 abstractC4099b5 = (AbstractC4099b5) this;
            int iMo9420i = abstractC4099b5.mo9420i();
            byte[] bArr = new byte[iMo9420i];
            Logger logger = AbstractC4238l4.f23285a;
            AbstractC4238l4.b bVar = new AbstractC4238l4.b(bArr, iMo9420i);
            abstractC4099b5.mo9416d(bVar);
            if (bVar.mo9975a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(10 + name.length() + 62);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: renamed from: h */
    public int mo9419h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public void mo9421j(int i) {
        throw new UnsupportedOperationException();
    }
}
