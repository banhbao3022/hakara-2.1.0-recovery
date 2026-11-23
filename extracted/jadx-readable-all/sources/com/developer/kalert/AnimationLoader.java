package com.developer.kalert;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class AnimationLoader {
    private static Animation createAnimationFromXml(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return createAnimationFromXml(context, xmlPullParser, null, Xml.asAttributeSet(xmlPullParser));
    }

    public static Animation loadAnimation(Context context, int i) throws Resources.NotFoundException {
        try {
            XmlResourceParser animation = context.getResources().getAnimation(i);
            try {
                Animation animationCreateAnimationFromXml = createAnimationFromXml(context, animation);
                if (animation != null) {
                    animation.close();
                }
                return animationCreateAnimationFromXml;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (animation != null) {
                        try {
                            animation.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException | XmlPullParserException e) {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            StringBuilder sbM1556G = outline.m1556G("Can't load animation resource ID #0x");
            sbM1556G.append(Integer.toHexString(i));
            throw new Resources.NotFoundException(sbM1556G.toString(), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    private static Animation createAnimationFromXml(Context context, XmlPullParser xmlPullParser, AnimationSet animationSet, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Animation rotateAnimation = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "rotate":
                            rotateAnimation = new RotateAnimation(context, attributeSet);
                            break;
                        case "set":
                            AnimationSet animationSet2 = new AnimationSet(context, attributeSet);
                            createAnimationFromXml(context, xmlPullParser, animationSet2, attributeSet);
                            rotateAnimation = animationSet2;
                            break;
                        case "alpha":
                            rotateAnimation = new AlphaAnimation(context, attributeSet);
                            break;
                        case "scale":
                            rotateAnimation = new ScaleAnimation(context, attributeSet);
                            break;
                        case "translate":
                            rotateAnimation = new TranslateAnimation(context, attributeSet);
                            break;
                        default:
                            try {
                                rotateAnimation = (Animation) Class.forName(name).getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
                                break;
                            } catch (Exception e) {
                                StringBuilder sbM1556G = outline.m1556G("Unknown animation name: ");
                                sbM1556G.append(xmlPullParser.getName());
                                sbM1556G.append(" error:");
                                sbM1556G.append(e.getMessage());
                                throw new RuntimeException(sbM1556G.toString());
                            }
                            break;
                    }
                    if (animationSet != null) {
                        animationSet.addAnimation(rotateAnimation);
                    }
                }
            }
        }
        return rotateAnimation;
    }
}
