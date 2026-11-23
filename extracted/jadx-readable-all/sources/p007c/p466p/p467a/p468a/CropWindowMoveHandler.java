package p007c.p466p.p467a.p468a;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: c.p.a.a.j, reason: use source file name */
/* JADX INFO: compiled from: CropWindowMoveHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class CropWindowMoveHandler {

    /* JADX INFO: renamed from: a */
    public final float f28054a;

    /* JADX INFO: renamed from: b */
    public final float f28055b;

    /* JADX INFO: renamed from: c */
    public final float f28056c;

    /* JADX INFO: renamed from: d */
    public final float f28057d;

    /* JADX INFO: renamed from: e */
    public final a f28058e;

    /* JADX INFO: renamed from: f */
    public final PointF f28059f;

    /* JADX INFO: renamed from: c.p.a.a.j$a */
    /* JADX INFO: compiled from: CropWindowMoveHandler.java */
    public enum a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    static {
        new Matrix();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002d. Please report as an issue. */
    public CropWindowMoveHandler(a aVar, CropWindowHandler cropWindowHandler, float f, float f2) {
        float fCenterY;
        float f3;
        float f4;
        float f5;
        PointF pointF = new PointF();
        this.f28059f = pointF;
        this.f28058e = aVar;
        this.f28054a = cropWindowHandler.m12535d();
        this.f28055b = cropWindowHandler.m12534c();
        this.f28056c = cropWindowHandler.m12533b();
        this.f28057d = cropWindowHandler.m12532a();
        RectF rectFM12536e = cropWindowHandler.m12536e();
        float fCenterX = 0.0f;
        switch (aVar) {
            case TOP_LEFT:
                fCenterX = rectFM12536e.left - f;
                fCenterY = rectFM12536e.top;
                f5 = fCenterY - f2;
                break;
            case TOP_RIGHT:
                fCenterX = rectFM12536e.right - f;
                fCenterY = rectFM12536e.top;
                f5 = fCenterY - f2;
                break;
            case BOTTOM_LEFT:
                fCenterX = rectFM12536e.left - f;
                fCenterY = rectFM12536e.bottom;
                f5 = fCenterY - f2;
                break;
            case BOTTOM_RIGHT:
                fCenterX = rectFM12536e.right - f;
                fCenterY = rectFM12536e.bottom;
                f5 = fCenterY - f2;
                break;
            case LEFT:
                f3 = rectFM12536e.left;
                f4 = f3 - f;
                fCenterX = f4;
                f5 = 0.0f;
                break;
            case TOP:
                fCenterY = rectFM12536e.top;
                f5 = fCenterY - f2;
                break;
            case RIGHT:
                f3 = rectFM12536e.right;
                f4 = f3 - f;
                fCenterX = f4;
                f5 = 0.0f;
                break;
            case BOTTOM:
                fCenterY = rectFM12536e.bottom;
                f5 = fCenterY - f2;
                break;
            case CENTER:
                fCenterX = rectFM12536e.centerX() - f;
                fCenterY = rectFM12536e.centerY();
                f5 = fCenterY - f2;
                break;
            default:
                f4 = 0.0f;
                fCenterX = f4;
                f5 = 0.0f;
                break;
        }
        pointF.x = fCenterX;
        pointF.y = f5;
    }

    /* JADX INFO: renamed from: g */
    public static float m12538g(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    /* JADX INFO: renamed from: a */
    public final void m12539a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f28059f.y -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.bottom;
        if (f > f5) {
            this.f28059f.y -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.top;
        float f7 = f - f6;
        float f8 = this.f28055b;
        if (f7 < f8) {
            f = f6 + f8;
        }
        float f9 = f - f6;
        float f10 = this.f28057d;
        if (f9 > f10) {
            f = f6 + f10;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > 0.0f) {
            float f11 = (f - f6) * f3;
            float f12 = this.f28054a;
            if (f11 < f12) {
                f = Math.min(f5, (f12 / f3) + f6);
                f11 = (f - rectF.top) * f3;
            }
            float f13 = this.f28056c;
            if (f11 > f13) {
                f = Math.min(rectF2.bottom, (f13 / f3) + rectF.top);
                f11 = (f - rectF.top) * f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.bottom, (rectF2.width() / f3) + rectF.top));
            } else {
                if (z) {
                    float f14 = rectF.right;
                    float f15 = f14 - f11;
                    float f16 = rectF2.left;
                    if (f15 < f16) {
                        f = Math.min(rectF2.bottom, ((f14 - f16) / f3) + rectF.top);
                        f11 = (f - rectF.top) * f3;
                    }
                }
                if (z2) {
                    float f17 = rectF.left;
                    float f18 = f11 + f17;
                    float f19 = rectF2.right;
                    if (f18 > f19) {
                        f = Math.min(f, Math.min(rectF2.bottom, ((f19 - f17) / f3) + rectF.top));
                    }
                }
            }
        }
        rectF.bottom = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m12540b(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.f28059f.x -= f / 1.1f;
        }
        float f4 = rectF2.left;
        if (f < f4) {
            this.f28059f.x -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.right;
        float f6 = f5 - f;
        float f7 = this.f28054a;
        if (f6 < f7) {
            f = f5 - f7;
        }
        float f8 = f5 - f;
        float f9 = this.f28056c;
        if (f8 > f9) {
            f = f5 - f9;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > 0.0f) {
            float f10 = (f5 - f) / f3;
            float f11 = this.f28055b;
            if (f10 < f11) {
                f = Math.max(f4, f5 - (f11 * f3));
                f10 = (rectF.right - f) / f3;
            }
            float f12 = this.f28057d;
            if (f10 > f12) {
                f = Math.max(rectF2.left, rectF.right - (f12 * f3));
                f10 = (rectF.right - f) / f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            } else {
                if (z) {
                    float f13 = rectF.bottom;
                    float f14 = f13 - f10;
                    float f15 = rectF2.top;
                    if (f14 < f15) {
                        f = Math.max(rectF2.left, rectF.right - ((f13 - f15) * f3));
                        f10 = (rectF.right - f) / f3;
                    }
                }
                if (z2) {
                    float f16 = rectF.top;
                    float f17 = f10 + f16;
                    float f18 = rectF2.bottom;
                    if (f17 > f18) {
                        f = Math.max(f, Math.max(rectF2.left, rectF.right - ((f18 - f16) * f3)));
                    }
                }
            }
        }
        rectF.left = f;
    }

    /* JADX INFO: renamed from: c */
    public final void m12541c(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, 0.0f);
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3) {
            rectF.offset(f3 - f2, 0.0f);
        }
        float f4 = rectF.right;
        float f5 = rectF2.right;
        if (f4 > f5) {
            rectF.offset(f5 - f4, 0.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12542d(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f28059f.x -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.right;
        if (f > f5) {
            this.f28059f.x -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.left;
        float f7 = f - f6;
        float f8 = this.f28054a;
        if (f7 < f8) {
            f = f6 + f8;
        }
        float f9 = f - f6;
        float f10 = this.f28056c;
        if (f9 > f10) {
            f = f6 + f10;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > 0.0f) {
            float f11 = (f - f6) / f3;
            float f12 = this.f28055b;
            if (f11 < f12) {
                f = Math.min(f5, (f12 * f3) + f6);
                f11 = (f - rectF.left) / f3;
            }
            float f13 = this.f28057d;
            if (f11 > f13) {
                f = Math.min(rectF2.right, (f13 * f3) + rectF.left);
                f11 = (f - rectF.left) / f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.right, (rectF2.height() * f3) + rectF.left));
            } else {
                if (z) {
                    float f14 = rectF.bottom;
                    float f15 = f14 - f11;
                    float f16 = rectF2.top;
                    if (f15 < f16) {
                        f = Math.min(rectF2.right, ((f14 - f16) * f3) + rectF.left);
                        f11 = (f - rectF.left) / f3;
                    }
                }
                if (z2) {
                    float f17 = rectF.top;
                    float f18 = f11 + f17;
                    float f19 = rectF2.bottom;
                    if (f18 > f19) {
                        f = Math.min(f, Math.min(rectF2.right, ((f19 - f17) * f3) + rectF.left));
                    }
                }
            }
        }
        rectF.right = f;
    }

    /* JADX INFO: renamed from: e */
    public final void m12543e(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.f28059f.y -= f / 1.1f;
        }
        float f4 = rectF2.top;
        if (f < f4) {
            this.f28059f.y -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.bottom;
        float f6 = f5 - f;
        float f7 = this.f28055b;
        if (f6 < f7) {
            f = f5 - f7;
        }
        float f8 = f5 - f;
        float f9 = this.f28057d;
        if (f8 > f9) {
            f = f5 - f9;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > 0.0f) {
            float f10 = (f5 - f) * f3;
            float f11 = this.f28054a;
            if (f10 < f11) {
                f = Math.max(f4, f5 - (f11 / f3));
                f10 = (rectF.bottom - f) * f3;
            }
            float f12 = this.f28056c;
            if (f10 > f12) {
                f = Math.max(rectF2.top, rectF.bottom - (f12 / f3));
                f10 = (rectF.bottom - f) * f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            } else {
                if (z) {
                    float f13 = rectF.right;
                    float f14 = f13 - f10;
                    float f15 = rectF2.left;
                    if (f14 < f15) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f13 - f15) / f3));
                        f10 = (rectF.bottom - f) * f3;
                    }
                }
                if (z2) {
                    float f16 = rectF.left;
                    float f17 = f10 + f16;
                    float f18 = rectF2.right;
                    if (f17 > f18) {
                        f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((f18 - f16) / f3)));
                    }
                }
            }
        }
        rectF.top = f;
    }

    /* JADX INFO: renamed from: f */
    public final void m12544f(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2.0f);
        float f2 = rectF.top;
        float f3 = rectF2.top;
        if (f2 < f3) {
            rectF.offset(0.0f, f3 - f2);
        }
        float f4 = rectF.bottom;
        float f5 = rectF2.bottom;
        if (f4 > f5) {
            rectF.offset(0.0f, f5 - f4);
        }
    }
}
