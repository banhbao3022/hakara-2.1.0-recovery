package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import p007c.p190n.p194b.p266d.p314j.p315a.d82;
import p007c.p190n.p194b.p266d.p314j.p315a.g82;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class d82<MessageType extends g82<MessageType, BuilderType>, BuilderType extends d82<MessageType, BuilderType>> extends s62<MessageType, BuilderType> {

    /* JADX INFO: renamed from: f */
    public final MessageType f13189f;

    /* JADX INFO: renamed from: g */
    public MessageType f13190g;

    /* JADX INFO: renamed from: h */
    public boolean f13191h = false;

    public d82(MessageType messagetype) {
        this.f13189f = messagetype;
        this.f13190g = (MessageType) messagetype.mo5663u(4, null, null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m6293l(MessageType messagetype, MessageType messagetype2) {
        s92.f19505a.m8349a(messagetype.getClass()).mo5950f(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.s62
    public final Object clone() throws CloneNotSupportedException {
        d82 d82Var = (d82) this.f13189f.mo5663u(5, null, null);
        d82Var.m6301p(mo6297k());
        return d82Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m92
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ l92 mo6294g() {
        return this.f13189f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.s62
    /* JADX INFO: renamed from: i */
    public final s62 clone() {
        d82 d82Var = (d82) this.f13189f.mo5663u(5, null, null);
        d82Var.m6301p(mo6297k());
        return d82Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.s62
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ s62 mo6296j(t62 t62Var) {
        m6301p((g82) t62Var);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public void m6298m() {
        MessageType messagetype = (MessageType) this.f13190g.mo5663u(4, null, null);
        s92.f19505a.m8349a(messagetype.getClass()).mo5950f(messagetype, this.f13190g);
        this.f13190g = messagetype;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.s62
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MessageType mo6297k() {
        if (this.f13191h) {
            return this.f13190g;
        }
        MessageType messagetype = this.f13190g;
        s92.f19505a.m8349a(messagetype.getClass()).mo5952h(messagetype);
        this.f13191h = true;
        return this.f13190g;
    }

    /* JADX INFO: renamed from: o */
    public final MessageType m6300o() {
        MessageType messagetype = (MessageType) mo6297k();
        if (messagetype.m6964p()) {
            return messagetype;
        }
        throw new na2(messagetype);
    }

    /* JADX INFO: renamed from: p */
    public final BuilderType m6301p(MessageType messagetype) {
        if (this.f13191h) {
            m6298m();
            this.f13191h = false;
        }
        m6293l(this.f13190g, messagetype);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final BuilderType m6302q(byte[] bArr, int i, int i2, s72 s72Var) throws r82 {
        if (this.f13191h) {
            m6298m();
            this.f13191h = false;
        }
        try {
            s92.f19505a.m8349a(this.f13190g.getClass()).mo5956l(this.f13190g, bArr, 0, i2, new w62(s72Var));
            return this;
        } catch (r82 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw r82.m8260a();
        }
    }
}
