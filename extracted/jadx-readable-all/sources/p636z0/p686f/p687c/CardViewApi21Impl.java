package p636z0.p686f.p687c;

import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: z0.f.c.a, reason: use source file name */
/* JADX INFO: compiled from: CardViewApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class CardViewApi21Impl implements CardViewImpl {
    /* JADX INFO: renamed from: a */
    public final RoundRectDrawable m15541a(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawable) ((CardView.C0093a) cardViewDelegate).f518a;
    }

    /* JADX INFO: renamed from: b */
    public void m15542b(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawable roundRectDrawableM15541a = m15541a(cardViewDelegate);
        CardView.C0093a c0093a = (CardView.C0093a) cardViewDelegate;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean zM271a = c0093a.m271a();
        if (f != roundRectDrawableM15541a.f36516e || roundRectDrawableM15541a.f36517f != useCompatPadding || roundRectDrawableM15541a.f36518g != zM271a) {
            roundRectDrawableM15541a.f36516e = f;
            roundRectDrawableM15541a.f36517f = useCompatPadding;
            roundRectDrawableM15541a.f36518g = zM271a;
            roundRectDrawableM15541a.m15546c(null);
            roundRectDrawableM15541a.invalidateSelf();
        }
        m15543c(cardViewDelegate);
    }

    /* JADX INFO: renamed from: c */
    public void m15543c(CardViewDelegate cardViewDelegate) {
        CardView.C0093a c0093a = (CardView.C0093a) cardViewDelegate;
        if (!CardView.this.getUseCompatPadding()) {
            c0093a.m272b(0, 0, 0, 0);
            return;
        }
        float f = m15541a(cardViewDelegate).f36516e;
        float f2 = m15541a(cardViewDelegate).f36512a;
        int iCeil = (int) Math.ceil(RoundRectDrawableWithShadow.m15547a(f, f2, c0093a.m271a()));
        int iCeil2 = (int) Math.ceil(RoundRectDrawableWithShadow.m15548b(f, f2, c0093a.m271a()));
        c0093a.m272b(iCeil, iCeil2, iCeil, iCeil2);
    }
}
