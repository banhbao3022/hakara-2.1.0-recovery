package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: renamed from: c.n.b.d.j.f.c7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3836c7<FieldDescriptorType> extends C3816a7<FieldDescriptorType, Object> {
    public C3836c7(int i) {
        super(i, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.C3816a7
    /* JADX INFO: renamed from: e */
    public final void mo8936e() {
        if (!this.f22512j) {
            for (int i = 0; i < m8937f(); i++) {
                Map.Entry<FieldDescriptorType, Object> entryM8934c = m8934c(i);
                if (((InterfaceC3993s4) entryM8934c.getKey()).mo9218n()) {
                    entryM8934c.setValue(Collections.unmodifiableList((List) entryM8934c.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m8938g()) {
                if (((InterfaceC3993s4) entry.getKey()).mo9218n()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo8936e();
    }
}
