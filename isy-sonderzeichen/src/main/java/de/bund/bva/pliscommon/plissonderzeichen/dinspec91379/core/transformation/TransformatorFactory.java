/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.pliscommon.plissonderzeichen.dinspec91379.core.transformation;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import de.bund.bva.pliscommon.plissonderzeichen.dinspec91379.core.transformation.impl.AbstractTransformator;


/**
 * The factory for the respective transformer.
 * 
 */
public class TransformatorFactory implements FactoryBean, InitializingBean {
    
    /** The transformer is set via Spring. */
    private AbstractTransformator transformator;
    
    /** Additional transformation table is set via Spring. */
    private String transformationsTabelle;

    /**
     * {@inheritDoc}
     */
    public void afterPropertiesSet() throws Exception {
        //Initialize transformer
        transformator.initialisiere(transformationsTabelle);
    }
    
    public void setTransformationsTabelle(String transformationsTabelle) {
        this.transformationsTabelle = transformationsTabelle;
    }

    public void setTransformator(AbstractTransformator transformator) {
        this.transformator = transformator;
    }

    /**
     * {@inheritDoc}
     */
    public Object getObject() throws Exception {
        return transformator;
    }

    /**
     * {@inheritDoc}
     */
    public Class getObjectType() {
        if (transformator == null) {
            return null;
        } else {
            return Transformator.class.getClass();
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean isSingleton() {
        return true;
    }
}
